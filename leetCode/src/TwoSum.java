public class TwoSum {

    public int sum(int num) {

        int[] vetor = {11, 12, 2, 7};
        int tamanho = vetor.length;

        for(int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if((vetor[i] + vetor[j]) == num) {
                    return 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        TwoSum twoSum = new TwoSum();
        System.out.println(twoSum.sum(9));
    }
}
