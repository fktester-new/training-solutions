package collectionscomp;

import java.text.Collator;
import java.util.*;

public class OrderedLibrary {
    private List<Book> libraryBooks = new LinkedList<>();

    public OrderedLibrary(List<Book> libraryBooks) {
        this.libraryBooks = libraryBooks;
    }

    public List<Book> orderedByTitle(){
        List<Book> orderedlist = new ArrayList<>(libraryBooks);
        Collections.sort(orderedlist);
        return orderedlist;
    }

    public List<Book> orderedByAuthor(){
        List<Book> orderedlist = new ArrayList<>(libraryBooks);
        Collections.sort(orderedlist, new AuthorComparator());
        return orderedlist;
    }

    public List<String> orderedByTitleLocale(Locale locale){
        List<String> orderedList = new ArrayList<>();
        for (Book book : libraryBooks){
            orderedList.add(book.getTitle());
        }
        Collator hunCollator = Collator.getInstance(locale);
        hunCollator.setStrength(Collator.PRIMARY);
        Collections.sort(orderedList, hunCollator);

        return orderedList;
    }
}
