public class Fatorial {
    public static int fatorial(int numero) {
        if (numero < 0 ) return 0;

        int resposta = 1;

        int i = 1;
        while (i <= numero) {
            resposta *= i;
            i++;
        }
        return resposta;
    }

    public static void main(String[] args) {
        System.out.print("Fatorial: ");
        System.out.print(fatorial(5));
    }
}
