package references.parameters;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person("John Doe", 34);
        Person person2 = person1;

        person2.setName("Jack Doe");

        System.out.println(person1.getName() + " " + person1.getAge()); //Jack Doe 34
        System.out.println(person2.getName() + " " + person2.getAge()); //Jack Doe 34, a 6. sorban referenciaátadás történt

        int a = 24;
        int b = a;
        b++;

        System.out.println(a); //24
        System.out.println(b); //25, a 14. sorban értékátadás történt

        person2 = new Person("Jane Doe", 32);

        System.out.println(person1.getName() + " " + person1.getAge()); //Jack Doe 34
        System.out.println(person2.getName() + " " + person2.getAge()); //Jane Doe 32, ez már új referencia

    }
}
