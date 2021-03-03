package covid;

import java.util.Scanner;

public class Validator {

    protected void validateRegistration() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg nevét!");
        String name = scanner.nextLine();
        System.out.println("Adja meg irányítószámát:");
        String zip = scanner.nextLine();
        System.out.println("Adja meg életkorát:");
        long age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Adja meg e-mail címét:");
        String email = scanner.nextLine();
        System.out.println("E-mail cím megerősítése:");
        String email2 = scanner.nextLine();
        if (! email.equals(email2)){
            System.out.println("A két e-mail cím nem egyenlő!");
            System.out.println("Sikertelen regsiztráció!");
            throw new IllegalArgumentException("Different e-mail addresses!");
        }
        System.out.println("Adja meg TAJ-számát:");
        String taj = scanner.nextLine();
        if (!validateTaj(taj)){
            System.out.println("Érvénytelen Taj-szám!");
            System.out.println("Sikertelen regisztráció!");
            throw new IllegalArgumentException("Invalid Social Security Number!");
        }
        Citizen citizen = new Citizen(name, zip, age, email, taj);
        System.out.println(citizen.toString());


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

}
