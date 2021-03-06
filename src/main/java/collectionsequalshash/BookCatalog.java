package collectionsequalshash;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BookCatalog {

    public Book findBookByTitleAuthor(List<Book> books, String title, String author){
        Book bookToSearch = new Book(title, author);
        if (!books.contains(bookToSearch)){
            return null;
        }
        int index = books.indexOf(bookToSearch);
        return books.get(index);
    }

    public Book findBook(List<Book> books, Book book){
        if (!books.contains(book)){
            return null;
        }
        int index = books.indexOf(book);
        return books.get(index);
    }

    public Set<Book> addBooksToSet(Book[] books){
        Set<Book> bookSet = new HashSet<>();
        for (Book book : books) {
            bookSet.add(book);
        }
        return bookSet;
    }
}
