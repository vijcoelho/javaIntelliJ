public class Exc2 {
    public static void main(String[] args) {

        int[] parVetor = new int[10];
        int[] imparVetor = new int[10];
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int indicePar = 0;
        int indiceImpar = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                parVetor[indicePar] = vetor[i] * 2;
                indicePar++;
            } else {
                imparVetor[indiceImpar] = vetor[i] * 3;
                indiceImpar++;
            }
        }

        for (int num : parVetor) {
            if (num != 0) {
                System.out.print(num + " ");
            }
        }

        for (int num : imparVetor) {
            if (num != 0) {
                System.out.print(num + " ");
            }
        }
    }
}
