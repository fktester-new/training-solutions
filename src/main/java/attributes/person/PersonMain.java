package attributes.person;

public class PersonMain {
    public static void main(String[] args) {
        PersonMain personMain = new PersonMain();

        Person person = new Person("John Doe", "AD234567");
        Address address = new Address("Magyarország", "Budapest", "Budaőrsi út 123.", "1118");

        person.moveToAddress(address);

        System.out.println(person.personToString());
        System.out.println(person.getAddress().addressToString());

        person.correctData("Jack Doe", "AE987654");
        System.out.println(person.personToString());

        person.getAddress().correctData("Magyarország", "Győr", "Baross G. u. 20.", "9021");
        System.out.println(person.getAddress().addressToString());

        Address newAddress = new Address("Magyarország", "Sopron", "Kőszegi út 55.", "9400");
        person.moveToAddress(newAddress);
        System.out.println(person.getAddress().addressToString());
    }
}
