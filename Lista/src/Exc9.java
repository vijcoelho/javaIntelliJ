public class Exc9 {
    public static void apareceuN(int[] array) {
        int vezes = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if(array[i] == array[j]) {
                    vezes++;
                }
            }
        }
        System.out.println(vezes);
    }

    public static void main(String[] args) {
        apareceuN(new int[]{1,2,3,4,5});
    }
}
