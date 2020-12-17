package week02d02;

import java.util.Scanner;

public class Phone {
    private String type;
    private int mem;

    public Phone(String type, int mem) {
        this.type = type;
        this.mem = mem;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMem() {
        return mem;
    }

    public void setMem(int mem) {
        this.mem = mem;
    }

    public static void main(String[] args) {
        Phone phone = new Phone("Samsung Galaxy S20",128);

        System.out.println(phone.getType());
        System.out.println("A telefon típusa:" + phone.getType() + ", " + "memória: " + phone.getMem() + " GB");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem a telefon típusát:");
        String type = scanner.nextLine();
        System.out.println("Kérem a háttértár kapacitását GB-ban:");
        int mem = scanner.nextInt();

        Phone otherPhone = new Phone(type, mem);
        System.out.println("A telefon típusa:" + otherPhone.getType() + ", " + "memória: " + otherPhone.getMem() + " GB");



    }
}
