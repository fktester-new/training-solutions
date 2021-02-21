package catalog;

import java.util.ArrayList;
import java.util.List;

public class PrintedFeatures implements Feature{

    private String title;
    private int numberOfPages;
    private List<String> authors;

    public PrintedFeatures(String title, int numberOfPages, List<String> authors){
        if (Validators.isBlank(title)){
            throw new IllegalArgumentException("Empty title");
        }
        if(numberOfPages <= 0 || Validators.isEmpty(authors)){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.authors = authors;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public List<String> getContributors() {
        return authors;
    }

}
