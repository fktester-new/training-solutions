package week12d02;

public class Report {

    private Fence fence;
    private int amount;

    public Report(Fence fence, int amount) {
        this.fence = fence;
        this.amount = amount;
    }

    public Fence getFence() {
        return fence;
    }

    public int getAmount() {
        return amount;
    }
}
