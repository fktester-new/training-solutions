package week08d02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {

    public List<Integer> getNumbers(int interval, int numbers){
        List<Integer> lottery = new ArrayList<>(numbers);
        for (int i = 0; i < numbers; i++){
            lottery.add(generateNumberNotInList(lottery, interval));
        }
        return lottery;
    }

    public List<Integer> getNumbersOneLoop(int interval, int numbers){
        List<Integer> result = new ArrayList<>();
        Random random = new Random(5);

        while(result.size() < numbers){
            int num = random.nextInt(interval) + 1;
            if (!result.contains(num)){
                result.add(num);
            }
        }
        return result;
    }


    private Integer generateNumberNotInList(List<Integer> myList, int interval){
        Random rnd = new Random(5);
        int number = rnd.nextInt(interval) + 1;
        while(myList.contains(number)){
            number = rnd.nextInt(interval) + 1;
        }
        return number;
    }
}
