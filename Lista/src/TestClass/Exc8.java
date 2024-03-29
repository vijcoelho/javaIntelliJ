package TestClass;

public class Exc8 {
    public static void negativoPrimeiro(int[] array) {
        int menor = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                int aux = array[i];
                array[i] = array[menor];
                array[menor] = aux;
                menor++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        negativoPrimeiro(new int[]{1,-2,-3,4,5});
    }
}
