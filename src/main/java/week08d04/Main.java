package week08d04;

public class Main {
    public static void main(String[] args) {
        Trainer goodTrainer = new Trainer(new GoodMood());
        Trainer badTrainer = new Trainer(new BadMood());

        System.out.println(goodTrainer.giveMark());
        System.out.println(badTrainer.giveMark());

       goodTrainer.setMood(new BadMood());
        System.out.println(goodTrainer.giveMark());
    }
}
