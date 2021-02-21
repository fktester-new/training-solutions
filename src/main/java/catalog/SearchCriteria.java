package catalog;

public class SearchCriteria {

    public static String contributor;
    public static String title;

    private SearchCriteria(String contributor, String title) {
        this.contributor = contributor;
        this.title = title;
    }

    public static SearchCriteria createByBoth(String title, String contributor){
        if (title == null || contributor == null){
            throw new IllegalArgumentException("Invalid input");
        }
        return new SearchCriteria(contributor, title);
    }

    public static SearchCriteria createByTitle(String title) {
        return createByBoth(title, "");
    }

    public static SearchCriteria createByContributor(String contributor) {
        return createByBoth("", contributor);
    }

    public boolean hasTitle() {
        return !Validators.isBlank(title);
    }

    public boolean hasContributor() {
        return !Validators.isBlank(contributor);
    }

    public static String getContributor() {
        return contributor;
    }

    public static String getTitle() {
        return title;
    }
}
