package week12d02;

public class Site {

    int side;
    int length;
    Fence fence;

    public Site(int side, int length, Fence fence) {
        this.side = side;
        this.length = length;
        this.fence = fence;
    }

    public int getSide() {
        return side;
    }

    public int getLength() {
        return length;
    }

    public Fence getFence() {
        return fence;
    }
}
