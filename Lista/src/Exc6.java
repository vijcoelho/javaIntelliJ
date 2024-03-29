public class Exc6 {
    public static String encontrarSoma(int[] A, int k) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; i < A.length; i++) {
                if ((A[i] + A[j]) == k) {
                    return "["+i+","+j+"]";
                }
            }
        }
        return "Nao achado";
    }

    public static void main(String[] args) {
        System.out.println(encontrarSoma(new int[]{1,2,10,4,3}, 5));
    }
}
