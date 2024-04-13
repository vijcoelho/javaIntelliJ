public class Exc4 {
    public void BubbleSort(int[] A) {
        int tamanho = A.length;
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = i + 1; j < tamanho; j++) {
                if (A[i] > A[j]) {
                    int aux = A[i];
                    A[i] = A[j];
                    A[j] = aux;
                }
            }
        }

        for (int i = 0; i < tamanho; i++) {
            System.out.println(A[i]);
        }
    }

    public static void main(String[] args) {
        Exc4 exc4 = new Exc4();
        exc4.BubbleSort(new int[] {1,3,10,5,8,2});
    }
}
