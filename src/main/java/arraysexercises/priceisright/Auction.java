package arraysexercises.priceisright;

public class Auction {

    public int priceIsRight(int[] bids, int price){
        int best = -1;
        for (int n : bids) {
            if(n < price && n > best)
                best = n;
        }
        return best;
    }
}
