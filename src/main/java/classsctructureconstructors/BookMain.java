package classsctructureconstructors;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Dan Brown", "Da Vinci kód");

        book.register("ISBN 12345678");

        System.out.println("A könyv írója: " + book.getAuthor());
        System.out.println("A könyv címe: " + book.getTitle());
        System.out.println("Regisztrációs szám: " + book.getRegNumber());
    }
}
