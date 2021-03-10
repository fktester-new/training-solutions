package collectionsiterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LibraryManager {

   private Set<Book> libraryBooks = new HashSet<>();

    public LibraryManager(Set<Book> libraryBooks) {
        this.libraryBooks = libraryBooks;
    }

    public Book findBookByRegNumber(int regNumber){
        Book book;
        Iterator<Book> iterator = libraryBooks.iterator();
            while(iterator.hasNext()){
                book = iterator.next();
                if (book.getRegNumber() == regNumber){
                    return book;
                }
        }
        throw new MissingBookException("No books found with regnumber: " + regNumber);
    }

    public int removeBookByRegNumber(int regNumber){

        Book book;
        Iterator<Book> iterator = libraryBooks.iterator();
        while(iterator.hasNext()){
            if (iterator.next().getRegNumber() == regNumber){
                iterator.remove();
                return regNumber;
            }
        }
        throw new MissingBookException("No books found with regnumber: " + regNumber);
    }

    public Set<Book> selectBooksByAuthor(String author){
        Set<Book> booksOfAuthor = new HashSet<>();

        Book book;
        Iterator<Book> iterator = libraryBooks.iterator();
        while(iterator.hasNext()){
            book = iterator.next();
            if (book.getAuthor().equals(author)){
                booksOfAuthor.add(book);
            }
        }
        if (booksOfAuthor.isEmpty()){
            throw new MissingBookException("No books found by " + author);
        }
        return booksOfAuthor;
    }

    public int libraryBooksCount(){
        return libraryBooks.size();
    }
}
