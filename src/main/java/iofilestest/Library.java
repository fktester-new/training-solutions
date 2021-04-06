package iofilestest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> libraryBooks = new ArrayList<>();

    public List<Book> getLibraryBooks() {
        return libraryBooks;
    }

    public void addBook(Book... books) {
        for (Book book : books) {
            if (notInLibrary(book)) {
                libraryBooks.add(book);
            }
        }
    }

    public void saveBooks(Path path) {
        try (BufferedWriter bw = Files.newBufferedWriter(path)) {
            for (Book book : libraryBooks) {
                bw.write(book.getAuthor() + ": " + book.getTitle() + "\n");
            }

        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file.", e);
        }
    }

    public List<Book> loadBooks(Path path) {
        List<Book> books = new ArrayList<>();
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            Book book;
            while ((line = br.readLine()) != null) {
                book = parseLine(line);
                books.add(book);
            }
            return books;
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file.", e);
        }
    }

    private Book parseLine(String line) {
        String[] temp = line.split(":");
        return new Book(temp[0], temp[1]);
    }

    private boolean notInLibrary(Book book) {
        for (Book b : libraryBooks) {
            if (b.equals(book)) {
                return false;
            }
        }
        return true;
    }
}

