package week15d03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PostFinderTest {


    Post post1 = new Post("abc", LocalDate.of(2021, 02, 6), "mail", "Jack");
    Post post2 = new Post("cde", LocalDate.of(2021, 02, 9), "postcard", "Jane");
    Post post3 = new Post("bcd", LocalDate.of(2021, 02, 7), "parcel", "Joe");
    Post post4 = new Post("aab", LocalDate.of(2021, 02, 5), "mail", "Jane");
    Post post5 = new Post("bbc", LocalDate.of(2021, 02, 9), "certified_mail", "Joe");
    Post post6 = new Post("abd", LocalDate.of(2021, 03, 2), "parcel", "Nobody");
    Post post7 = new Post("dfg", LocalDate.of(2021, 02, 21), "mail", "Nobody");
    Post post8 = new Post("asd", LocalDate.of(2021, 02, 10), "mail", null);
    Post post9 = null;

    @Test
    public void testFindPostFor() {
        List<Post> postItems = List.of(post1, post2, post3, post4, post5);
        PostFinder pf = new PostFinder(postItems);
        List<Post> result = pf.findPostsFor("Joe");

        assertEquals(2, result.size());

    }

    @Test
    public void testPostValidator() {
        List<Post> postItems = List.of(post1, post2, post3, post4, post5);
        PostFinder pf = new PostFinder(postItems);
        List<Post> result = pf.findPostsFor("John");
        assertEquals(0, result.size());

        List<Post> wrongItems = List.of(post6, post7);
        PostFinder wrong = new PostFinder(wrongItems);
        List<Post> result2 = wrong.findPostsFor("Nobody");
        assertEquals(0, result2.size());
    }
}