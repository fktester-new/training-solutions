package array;

public class ArrayHandler {

        public boolean contains (int [] source, int itemToFind) {
            for (int item: source) {
                if (item == itemToFind) {
                    return true;
                }
            }
            return false;
        }

        public int find(int[] source, int itemToFind) {
            for (int i = 0; i < source.length; i++) {
                if (source[i] == itemToFind) {
                    return i;
                }
            }
            return -1;
        }
    public static void main(String[] args) {
           ArrayHandler arrayHandler = new ArrayHandler();

           final int [] testArray =  new int [] {2, 4, 6, 8, 10};

        System.out.println("Tartalmazza:");
        System.out.println(arrayHandler.contains(testArray, 8));
        System.out.println(arrayHandler.contains(testArray, 5));

        System.out.println("Az elem indexe:");
        System.out.println(arrayHandler.find(testArray, 8));
        System.out.println(arrayHandler.find(testArray, 5));
    }
}

