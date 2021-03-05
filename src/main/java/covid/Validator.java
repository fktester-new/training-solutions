package covid;

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
        //System.out.println(citizen.getCitizen_name());
        //System.out.println(citizen.getTaj());
        return citizen;
        //insertCitizen(citizen);

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
