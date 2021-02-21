package catalog;

import java.util.ArrayList;
import java.util.List;

public class CatalogItem {

    private String registrationNumber;
    private int price;
    private List<Feature> features = new ArrayList<>();

    public CatalogItem(String registrationNumber, int price, Feature... feature) {
        this.registrationNumber = registrationNumber;
        this.price = price;
        for (Feature f : feature) {
            features.add(f);
        }
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public int getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int fullLengthAtOneItem() {
        int length = 0;
        for (Feature f : features) {
            if (f instanceof AudioFeatures) {
                length += ((AudioFeatures) f).getLength();
            }
        }
        return length;
    }

    public boolean hasAudioFeature() {
        for (Feature f : features) {
            if (f instanceof AudioFeatures) {
                return true;
            }
        }
        return false;
    }

    public boolean hasPrintedFeature() {
        for (Feature f : features) {
            if (f instanceof PrintedFeatures) {
                return true;
            }
        }
        return false;
    }


    public int numberOfPagesAtOneItem() {
        int pages = 0;
        for (Feature f : features) {
            if (f instanceof PrintedFeatures) {
                pages += ((PrintedFeatures) f).getNumberOfPages();
            }
        }
        return pages;
    }

    public List<String> getContributors() {
        List<String> result = new ArrayList<>();
        for (Feature feature : features) {
            result.addAll(feature.getContributors());
        }
        return result;
    }

    public List<String> getTitles() {
        List<String> result = new ArrayList<>();
        for (Feature feature : features) {
            result.add(feature.getTitle());
        }
        return result;
    }
}
