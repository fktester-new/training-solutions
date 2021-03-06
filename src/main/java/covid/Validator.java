package covid;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Validator {

    protected Citizen validateRegistration() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg nevét!");
        String name = scanner.nextLine();
        while(name.isEmpty()){
            System.out.println("Nem adta meg a nevét!");
            System.out.println("Írja be most!");
            name = scanner.nextLine();
            }

        System.out.println("Adja meg irányítószámát:");
        String zip = scanner.nextLine();
        while(zip.isEmpty()){
            System.out.println("Nem adott meg irányítószámot!");
            System.out.println("Adja meg most!");
            zip = scanner.nextLine();
        }


        System.out.println("Adja meg életkorát:");
        long age = scanner.nextInt();
        while (age <= 10 || age >=150){
            System.out.println("Érvénytelen életkor!");
            System.out.println("Próbálja meg újra!");
            scanner.nextLine();
            age = scanner.nextInt();
        }
        scanner.nextLine();
        System.out.println("Adja meg e-mail címét:");
        String email = scanner.nextLine();
        if (!validateEmail(email)){
            System.out.println("Érvénytelen e-mail cím!");
            System.out.println("Sikertelen regisztráció!");
            return null;
        }
        System.out.println("E-mail cím megerősítése:");
        String email2 = scanner.nextLine();
        if (! email.equals(email2)){
            System.out.println("A két e-mail cím nem egyenlő!");
            System.out.println("Sikertelen regsiztráció!");
            return null;
        }
        System.out.println("Adja meg TAJ-számát:");
        String taj = scanner.nextLine();
        if (!validateTaj(taj)) {
            System.out.println("Érvénytelen Taj-szám!");
            System.out.println("Sikertelen regisztráció!");
            return null;
        }
        System.out.println("Sikeres regisztráció!");
        Citizen citizen = new Citizen(name, zip, age, email, taj);

        return citizen;
    }

    public List<Citizen> importCsvFile(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg a beolvasandó csv fájl nevét!");
        String fileName = scanner.nextLine();
        while(fileName.isEmpty()){
            System.out.println("Nem adott meg fájlnevet!");
            System.out.println("Adja meg most!");
            fileName = scanner.nextLine();
        }
        Path path = Path.of(fileName);
        List<Citizen> citizens = fileReader(path);
        return citizens;
    }

    private List<Citizen> fileReader(Path path) {
        List<Citizen> result;
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            result = new Validator().readLines(reader);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        return result;
    }

    public List<Citizen> readLines(BufferedReader reader) throws IOException {
        List<Citizen> result = new ArrayList<>();
        String line;
        reader.readLine();
        int lineNr = 1;
        while ((line = reader.readLine())  != null) {
            lineNr++;
            Citizen citizen = parseLine(line);
            if(citizen == null){
                System.out.println("Hibás adatok a(z) " + lineNr + ".sorban!");
            } else {
                result.add(citizen);
            }
        }
        return result;
    }

    private Citizen parseLine(String line) {
        String[] data = line.split(";");
        String name = data[0];
        String zip = data[1];
        long age = Long.parseLong(data[2]);
        String email = data[3];
        String taj = data[4];
        Citizen citizen = null;
        if (name != null && zip != null && age > 10 && age < 150 && validateEmail(email) && validateTaj(taj)){
            citizen = new Citizen(name, zip, age, email, taj);
        }
        return citizen;
        }

    public String generateReport() {
        String r = "Maybe later!";
        System.out.println(r);
        return r;
    }

    private boolean validateTaj(String str){
        String[] values = str.split("");
        int odd = Integer.parseInt(values[0]) + Integer.parseInt(values[2]) +Integer.parseInt(values[4]) + Integer.parseInt(values[6]);
        int even = Integer.parseInt(values[1]) + Integer.parseInt(values[3]) + Integer.parseInt(values[5]) + Integer.parseInt(values[7]);

        int sum = 3 * odd + 7 * even;
        if (sum % 10 == Integer.parseInt(values[8])){
            return true;
        } else {
            return false;
        }
    }

    private boolean validateEmail(String str){
        return (str.contains("@") && str.length() > 4);
    }
}
