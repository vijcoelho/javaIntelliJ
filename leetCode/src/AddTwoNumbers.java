import java.util.Arrays;

public class AddTwoNumbers {
    public int[] addTwoNumbers(int[] l1, int[] l2) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int num: l1) {
            sb.append(num);
        }
        for (int num: l2) {
            sb2.append(num);
        }
        int finalValor = Integer.parseInt(sb.toString()) + Integer.parseInt(sb2.toString());

        String resultadoString = String.valueOf(finalValor);
        int[] finalArray = new int[resultadoString.length()];

        for (int i = 0; i < resultadoString.length(); i++) {
            finalArray[resultadoString.length() - 1 - i] = Character.getNumericValue(resultadoString.charAt(i));
        }

        return finalArray;
    }

    public static void main(String[] args) {
        AddTwoNumbers add = new AddTwoNumbers();
        System.out.println(Arrays.toString(add.addTwoNumbers(new int[]{2, 4, 3}, new int[]{5, 6, 4})));
    }
}
