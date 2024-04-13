public class Exc5 {
    public void removeElement(int[] arr , int target) {
        int tamanho = arr.length;
        for (int i = 0; i < tamanho; i++) {
            if (arr[i] == target) {
                arr[i] = arr[i + 1];
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Exc5 exc5 = new Exc5();
        exc5.removeElement(new int[] {1,2,3,4,5}, 3);
    }
}
