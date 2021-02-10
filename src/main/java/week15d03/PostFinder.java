package week15d03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PostFinder {

    private List<Post> postItems;

    public PostFinder(List<Post> postItems) {
        this.postItems = postItems;
    }

    public List<Post> getPostItems() {
        return postItems;
    }
    public List<Post> findPostsFor(String user) {
        if (postItems == null) {
            throw new IllegalArgumentException("Wrong input data!");
        }
        List<Post> result = new ArrayList<>();
        for (Post post : postItems) {
            if (!postHasData(post)) {
                throw new IllegalArgumentException("At least one of the input parameters is empty or null!");
            }
            if(postValidator(post, user)){
                result.add(post);
            }
        }
        return result;
    }

    private boolean postHasData(Post post){

        if (post.getTitle().isBlank()  || post.getTitle() == null){
            return false;
        }
        if (post.getPublishedAt() == null){
            return false;
        }
        if (post.getContent().isBlank() || post.getContent() == null) {
            return false;
        }
        if (post.getOwner().isBlank() || post.getOwner() == null){
            return false;
        }
        return true;
    }

    private boolean postValidator(Post post, String user){

        if (user.equals(post.getOwner()) && post.getPublishedAt().isBefore(LocalDate.now())){
          return true;
        }
        return false;
    }
}
