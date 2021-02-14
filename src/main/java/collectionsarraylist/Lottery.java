package collectionsarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lottery {

    public List<Integer> selectWinningNumbers(int lotteryType, int ballCount){
        if (lotteryType >= ballCount){
            throw new IllegalArgumentException("Balls must be more then the winning numbers!");
        }
        List<Integer> balls = createBalls(ballCount);
        List<Integer> winningNumbers = balls.subList(0, lotteryType);
        Collections.sort(winningNumbers);

        return winningNumbers;
    }

    private List<Integer> createBalls(int nr){
        List<Integer> balls = new ArrayList<>();
        for (int i = 1; i <= nr; i++){
            balls.add(i);
        }
        Collections.shuffle(balls);
        return balls;
    }
}
