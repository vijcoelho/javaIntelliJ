public class Exc7 {
    public static void removeDuplicates(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length - 1; j++) {
                if (array[i] == array[j]) {
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        removeDuplicates(new int[]{1,2,3,4,4});
    }
}
