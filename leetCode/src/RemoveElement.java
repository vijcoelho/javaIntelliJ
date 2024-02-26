import java.util.Arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                if(k != i) {
                    nums[k] = nums[i];
                }
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();

        System.out.println(removeElement.removeElement(new int[]{2}, 3));
    }
}
