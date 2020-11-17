package typeconversion.dataloss;

public class Dataloss {

    public static final int MAX_NUMBER_OF_LOSS = 3;

    public void dataLoss() {
        long original = 0;
        for(long counter = 0; counter < MAX_NUMBER_OF_LOSS;) {
            long converted = (long) (float) original;
            if (converted != original) {
                System.out.println("Origin: " + original + " in binary: " + Long.toBinaryString(original));
                System.out.println("Converted: " + converted + " in binary: " + Long.toBinaryString(converted));
                System.out.println("Number of bits: " + Long.toBinaryString(original).length());
                counter++;
            }
            original++;
        }

    }

    public static void main(String[] args) {
        new Dataloss().dataLoss();
    }
}


