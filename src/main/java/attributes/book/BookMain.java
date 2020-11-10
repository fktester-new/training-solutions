package attributes.book;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Tüskevár");
        System.out.println(book.getTitle());

        book.setTitle("A kőszívű ember fiai");
        System.out.println(book.getTitle());


    }
}
