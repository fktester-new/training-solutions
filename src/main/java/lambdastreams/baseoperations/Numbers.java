package lambdastreams.baseoperations;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Numbers {

    private List<Integer> numbers;

    public Numbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public Optional<Integer> min(){
        return numbers.stream().min(Comparator.naturalOrder());
    }

    public Integer sum() {
        return numbers.stream().reduce(0, (a, b) -> a + b);
    }

    public boolean isAllPositive(){
        Predicate<Integer> pred = x -> x > 0;
        return numbers.stream().allMatch(pred);
    }

    public Set<Integer> getDistinctElements(){
        //Set<Integer> distinct = numbers.stream().collect(HashSet::new, HashSet::add, HashSet::addAll);
        //return distinct;
        return numbers.stream().collect(Collectors.toSet());
    }
}
