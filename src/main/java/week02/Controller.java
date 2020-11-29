package week02;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Controller {
    private Office office;

    public void readOffice() {
        office = new Office();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem az irodák számát!");
        int numberOfMeetingRooms = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfMeetingRooms; i++) {
            System.out.println("Kérem az iroda nevét:");
            String name = scanner.nextLine();
            System.out.println("Kérem a hosszúságot:");
            int length = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Kérem a szélességet:");
            int width = scanner.nextInt();
            scanner.nextLine();

            MeetingRoom meetingRoom = new MeetingRoom(name, length, width);
            office.addMeetingRoom(meetingRoom);

        }
    }

    public Office getOffice() {
        return office;
    }

    public void printMenu(){
        System.out.println("1. Tárgyalók sorrendben \n" +
        "2. Tárgyalók visszafele sorrendben \n" +
        "3. Minden második tárgyaló \n" +
        "4. Területek \n" +
        "5. Keresés pontos név alapján \n" +
        "6. Keresés névtöredék alapján \n" +
        "7. Keresés terület alapján \n");
    }

    public void runMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Válasszon menüpontot:");
        int menuItem = scanner.nextInt();
        scanner.nextLine();

        if (menuItem == 1){
            office.printNames();
        }
        if (menuItem == 2) {
            office.printNamesReverse();
        }
        if (menuItem == 3){
            office.printEvenNames();
        }
        if (menuItem == 4){
            office.printAreas();
            }
        if (menuItem == 5){
            System.out.println("Adja meg a keresett tárgyaló nevét:");
            String name = scanner.nextLine();

            office.printMeetingRoomsWithName(name);
        }
        if (menuItem == 6){
            System.out.println("Adja meg a keresett tárgyaló nevének ismert részét:");
            String text = scanner.nextLine();

            office.printMeetingRoomsContains(text);
        }
        if (menuItem == 7){
            System.out.println("Kérek egy alapterületet:");
            int area = scanner.nextInt();
            scanner.nextLine();

            office.getAreasLargerThan(area);
        }
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.readOffice();
        System.out.println(controller.getOffice().getMeetingRooms().size());
        controller.printMenu();
        controller.runMenu();

    }
}
