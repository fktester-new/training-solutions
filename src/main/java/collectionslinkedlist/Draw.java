package collectionslinkedlist;

import java.util.*;

public class Draw {

    public Set<Integer> drawNumbers(int drawCount, int maxNumber){
        if (drawCount >= maxNumber){
            throw new IllegalArgumentException("drawCount must be less then " + maxNumber + "!");
        }
        return new TreeSet<>(createBalls(maxNumber));
    }


    private List<Integer> createBalls(int nr){
        List<Integer> balls = new LinkedList<>();
        for (int i = 1; i <= nr; i++){
            balls.add(i);
        }
        Collections.shuffle(balls);
        return balls;
    }

}
