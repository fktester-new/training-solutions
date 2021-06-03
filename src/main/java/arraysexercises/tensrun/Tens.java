package arraysexercises.tensrun;

public class Tens {

    public int[] tenRun(int[] nums) {
        int actual = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0 && actual != nums[i]) {
                actual = nums[i];
            }
            if (actual != -1) {
                nums[i] = actual;
            }
        }
        return nums;
    }

}
