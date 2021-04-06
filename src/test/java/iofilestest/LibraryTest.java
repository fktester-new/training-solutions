package iofilestest;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    public void addTest(){
        Library library = new Library();
        assertEquals(0, library.getLibraryBooks().size());

        library.addBook(
                new Book("Fekete István", "Vuk"),
                new Book("Fekete István", "Tüskevár"),
                new Book("Gárdonyi Géza", "Egri csillagok"));
        assertEquals(3, library.getLibraryBooks().size());
        assertEquals("Fekete István", library.getLibraryBooks().get(0).getAuthor());
        assertEquals("Vuk", library.getLibraryBooks().get(0).getTitle());

    }

    @Test
    public void addExixtingBookTest(){
        Library library = new Library();
        assertEquals(0, library.getLibraryBooks().size());

        library.addBook(
                new Book("Fekete István", "Vuk"),
                new Book("Fekete István", "Tüskevár"),
                new Book("Gárdonyi Géza", "Egri csillagok"),
                new Book("Jókai Mór", "Aranyember"));
        assertEquals(4, library.getLibraryBooks().size());

        library.addBook(
                new Book("Fekete István", "Vuk"),
                new Book("Gárdonyi Géza", "Egri csillagok"));

        assertEquals(4, library.getLibraryBooks().size());
    }

    @Test
    public void saveBooksTest(){
        Library library = new Library();

        library.addBook(
                new Book("Fekete István", "Vuk"),
                new Book("Fekete István", "Tüskevár"),
                new Book("Gárdonyi Géza", "Egri csillagok"),
                new Book("Jókai Mór", "Aranyember"));

        library.saveBooks(Path.of("librarycopy.txt"));
        assertTrue(Files.isRegularFile(Path.of("librarycopy.txt")));
    }

    @Test
    public void loadBooksTest(){
        Library library = new Library();
        List<Book> libraryBooks = library.loadBooks(Path.of("src/main/java/iofilestest/librarysource.txt"));
        assertEquals(4, libraryBooks.size());
    }
}