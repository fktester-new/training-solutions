package week03d05;

public class Operation {

    private int left;
    private int right;

    public Operation(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeft() {

        return left;
    }

    public int getRight() {

        return right;
    }

    public int getResult(int left, int right) {
        return  left + right;
    }

}
