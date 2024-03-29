import java.util.Random;

public class Exc5 {
    public static void embaralhar(int[] array) {
        Random random = new Random();

        for (int i = array.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int aux = array[i];
            array[i] = array[j];
            array[j] = aux;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        embaralhar(new int[]{1,2,3,4,5});
    }
}
