package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    protected List<CatalogItem> catalogItems = new ArrayList<>();

    public void addItem(CatalogItem item) {
        catalogItems.add(item);
    }

    public void deleteItemByRegistrationNumber(String registrationNumber) {
        CatalogItem toDel = null;
        for (CatalogItem item : catalogItems) {
            if (registrationNumber.equals(item.getRegistrationNumber())) {
                toDel = item;
            }
        }
        catalogItems.remove(toDel);
    }

    public List<CatalogItem> getAudioLibraryItems() {
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem item : catalogItems) {
            if (item.hasAudioFeature()) {
                result.add(item);
            }
        }
        return result;
    }

    public List<CatalogItem> getPrintedLibraryItems() {
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem item : catalogItems) {
            if (item.hasPrintedFeature()) {
                result.add(item);
            }
        }
        return result;
    }

    public int getAllPageNumber() {
        int sum = 0;
        for (CatalogItem item : catalogItems) {
            if (item.hasPrintedFeature()) {
                sum += item.numberOfPagesAtOneItem();
            }
        }
        return sum;
    }

    public int getFullLength() {
        int sum = 0;
        for (CatalogItem item : catalogItems) {
            if (item.hasAudioFeature()) {
                sum += item.fullLengthAtOneItem();
            }
        }
        return sum;
    }

    public double averagePageNumberOver(int limit) {
        double sum = 0.0;
        double counter = 0.0;
        if (limit <= 0) {
            throw new IllegalArgumentException("Page number must be positive");
        }
        for (CatalogItem item : catalogItems) {
            if (item.numberOfPagesAtOneItem() > limit) {
                sum += item.numberOfPagesAtOneItem();
                counter++;
            }
            if (counter == 0) {
                throw new IllegalArgumentException("No page");
            }
        }
        return sum / counter;
    }

    public List<CatalogItem> findByCriteria(SearchCriteria searchCriteria) {
        if (searchCriteria.hasTitle() && searchCriteria.hasContributor()) {
            return findByCriteriaContributor(searchCriteria, findByCriteriaTitle(searchCriteria, catalogItems));
        }
        if (searchCriteria.hasTitle()) {
            return findByCriteriaTitle(searchCriteria, catalogItems);
        }
        if (searchCriteria.hasContributor()) {
            return findByCriteriaContributor(searchCriteria, catalogItems);
        }
        return new ArrayList<>();
    }

    private List<CatalogItem> findByCriteriaTitle(SearchCriteria searchCriteria, List<CatalogItem> catalogItems) {
        List<CatalogItem> foundItems = new ArrayList<>();
        for (CatalogItem item : catalogItems) {
            for (String title : item.getTitles()) {
                if (title.equals(searchCriteria.getTitle())) {
                    foundItems.add(item);
                }
            }
        }
        return foundItems;
    }

    private List<CatalogItem> findByCriteriaContributor(SearchCriteria searchCriteria, List<CatalogItem> catalogItems) {
        List<CatalogItem> foundItems = new ArrayList<>();
        for (CatalogItem item : catalogItems) {
            for (String contributor : item.getContributors()) {
                if (contributor.equals(searchCriteria.getContributor())) {
                    foundItems.add(item);
                }
            }
        }
        return foundItems;
    }
}

