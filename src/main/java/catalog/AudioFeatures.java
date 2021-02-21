package catalog;

import java.util.ArrayList;
import java.util.List;

public class AudioFeatures implements Feature {

    private int length;
    private String title;
    private List<String> composer;
    private List<String> performers = new ArrayList<>();


    public AudioFeatures(String title, int length, List<String> composer, List<String> performers) {

        if (Validators.isBlank(title) || Validators.isEmpty(composer) || length < 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        this.title = title;
        this.length = length;
        this.composer = composer;
        this.performers = performers;
    }

    public AudioFeatures(String title, int length, List<String> composer) {
        if (Validators.isBlank(title) || Validators.isEmpty(composer) || length < 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        this.title = title;
        this.length = length;
        this.composer = composer;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public List<String> getContributors() {
        List<String> result = new ArrayList<>();
        result.addAll(performers);
        result.addAll(composer);
        return result;
    }

}
