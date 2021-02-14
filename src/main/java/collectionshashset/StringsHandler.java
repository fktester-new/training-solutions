package collectionshashset;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class StringsHandler {

    public Set<String> filterUniqueStrings(Collection<String> stringCollection){
        Set<String> uniqueStrings = new HashSet<>(stringCollection);
        return uniqueStrings;
        }
    public Set<String> selectIdenticalStrings(Set<String> setA, Set<String> setB){
        Set<String> intersection = new HashSet<String>(setA);
        intersection.retainAll(setB);
        return intersection;
    }
}
