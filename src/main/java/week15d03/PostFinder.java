package week15d03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PostFinder {

    private List<Post> postItems;

    public PostFinder(List<Post> postItems) {
        this.postItems = postItems;
    }

    public List<Post> getPostItems() {
        return postItems;
    }
    public List<Post> findPostsFor(String user) {
        Objects.requireNonNull(user, "User is null!");
        Objects.requireNonNull(postItems, "The list of postItems is null!");

        List<Post> result = new ArrayList<>();
        for (Post post : postItems) {
            isNotNullOrEmpty(post);
            if(postValidator(post, user)){
                result.add(post);
            }
        }
        return result;
    }

    private boolean isNotNullOrEmpty(Post post){
        Objects.requireNonNull(post.getTitle(), "The title is null!");
        Objects.requireNonNull(post.getPublishedAt(), "The date of publishing is null!");
        Objects.requireNonNull(post.getContent(), "The content is null!");
        Objects.requireNonNull(post.getOwner(), "The owner is null!");

        if (post.getTitle().isBlank()){
            throw new IllegalArgumentException("The title is empty!");
        }
        if (post.getContent().isBlank()) {
            throw new IllegalArgumentException("The content is empty!");
        }
        if (post.getOwner().isBlank()){
            throw new IllegalArgumentException("The owner is empty!");
        }
        return true;
    }

    private boolean postValidator(Post post, String user){

        return (user.equals(post.getOwner()) && post.getPublishedAt().isBefore(LocalDate.now()));
    }
}
