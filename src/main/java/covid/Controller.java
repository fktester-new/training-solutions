package covid;

import java.util.Scanner;

public class Controller {

    private Validator validator = new Validator();


    public  void printMenu(){
        System.out.println(
                "1. Regisztráció \n" +
        "2. Tömeges regisztráció \n" +
        "3. Generálás \n" +
        "4. Oltás \n" +
        "5. Oltás meghiúsulás \n" +
        "6. Riport \n" +
        "7. Kilépés \n");
    }

    public void runMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Válasszon menüpontot:");
        int menuItem = scanner.nextInt();
        scanner.nextLine();

        switch(menuItem){
            case 1:
                validator.validateRegistration();
                break;
            case 2:
                //massRegistration();
                break;
            case 3:
                //massRegistration();
                break;
            case 4:
                //manageVaccination();
                break;
            case 5:
                //vaccinationFailure();
                break;
            case 6:
                validator.generateReport();
                break;
            case 7:
                System.out.println("Viszontlátásra!");
                break;
            default:
                System.out.println("Nincs ilyen menüpont");
                System.out.println("Próbálja meg újra!");
                printMenu();
                runMenu();
        }
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.printMenu();
        controller.runMenu();
    }

}
