public class AddTwoNumbers {
    public void addTwoNumbers(int[] l1, int[] l2) {
        for (int i = 0; i < l1.length; i++) {
            l1[i] += l2[i];
            System.out.println(l1[i]);
        }
    }

    public static void main(String[] args) {
        AddTwoNumbers add = new AddTwoNumbers();
        add.addTwoNumbers(new int[]{2,4,3}, new int[]{5,6,4});
    }
}
