package lambdaintro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class SocialNetwork {

    private List<Member> members;

    public SocialNetwork(List<Member> members) {
        this.members = members;
    }

    public List<Member> getMembers() {
        return members;
    }

    public List<Member> findMembersBy(Predicate<Member> predicate){
        List<Member> result = new ArrayList<>();

        for (Member member : members) {
            if (predicate.test(member)){
                result.add(member);
            }
        }
        return result;
    }

    public void applyToSelectedMembers(Predicate<Member> predicate, Consumer<Member> consumer){
        for (Member member : members) {
            if (predicate.test(member)){
                consumer.accept(member);
            }
        }
    }

    public <T> List<T> transformMembers(Function<Member, T> function){
        List<T> transformed = new ArrayList<>();

        for (Member member : members) {
            transformed.add(function.apply(member));
        }
        return transformed;
    }
}
