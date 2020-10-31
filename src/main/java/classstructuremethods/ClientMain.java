package classstructuremethods;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        client.setName("John Doe");
        client.setYear(1991);
        client.setAddress("9021 Győr, Baross u. 28.");

        System.out.println("Név: " + client.getName());
        System.out.println("Születési év: " + client.getYear());
        System.out.println("Lakcím: " + client.getAddress());

        client.migrate("9023 Győr, Fehérvári út 3.");
        System.out.println("Új lakcím: " + client.getAddress());
    }
}
