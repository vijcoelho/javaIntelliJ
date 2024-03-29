public class Exc7 {
    public static void removeDuplicates(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[j] = 0;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                System.out.println(array[i]);
            }
        }
    }

    public static void main(String[] args) {
        removeDuplicates(new int[]{1,2,2,4});
    }
}
