package exam02.photo;

import java.util.ArrayList;
import java.util.List;

public class PhotoCollection {

    private List<Photo> photos = new ArrayList<>();

    public void addPhoto(String ... photos){
        for (String s : photos){
            this.photos.add(new Photo(s));
        }
    }

    public void starPhoto(String name, Quality quality){
        for (Photo photo : photos) {
            if (name.equals(photo.getName())){
                photo.setQuality(quality);
                return;
            }
        }
        throw new PhotoNotFoundException("Cannot find photo");
    }

    public int numberOfStars(){
        int sum = 0;
        for (Photo photo : photos) {
            sum += photo.getQuality().getValue();
        }
        return sum;
    }

    public List<Photo> getPhotos() {
        return new ArrayList<>(photos);
    }

}
