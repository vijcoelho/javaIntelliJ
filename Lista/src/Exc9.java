public class Exc9 {
    public static void apareceuN(int[] array) {
        int quantidadeIgual = 0;
        int i = 0;

        while (i < array.length) {
            int j = i + 1;
            while (j < array.length && array[i] == array[j]) {
                j++;
            }
            quantidadeIgual++;
            i = j;
        }

        System.out.println(quantidadeIgual);
    }

    public static void main(String[] args) {
        apareceuN(new int[]{1, 2, 3, 3, 3, 3, 3, 3, 4, 5});
    }
}

