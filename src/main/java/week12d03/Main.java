package week12d03;

public class Main {

    public static void main(String[] args) {
        NumberStat ns = new NumberStat();
        ns.readFromFile("test.txt");
        System.out.println(ns.findSmallestUniqueNumber());
    }
}
