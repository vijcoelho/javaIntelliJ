public class MoveZero {
    public void moveZero(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            if (nums[i] == 0 && nums[j] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            } else if (nums[i] != 0) {
                i++;
            } else {
                j--;
            }
        }
        for (int k: nums) {
            System.out.println(k + " ");
        }
    }

    public static void main(String[] args) {
        MoveZero moveZero = new MoveZero();
        moveZero.moveZero(new int[]{0,1,0,3,12});
    }
}
