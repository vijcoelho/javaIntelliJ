import java.util.Scanner;

public class Exc3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] vetor = {"Vitor", "Rafael", "Julia", "Marco",
                          "Ricardo", "Teixeira", "Pedro", "Paulo",
                          "Alex", "Fabricio"};

        String elemento = scanner.next();
        boolean encontrado = false;

        for (int i = 0; i < vetor.length; i++) {
            if(elemento.equals(vetor[i])) {
                System.out.println("ACHEI");
                encontrado = true;
                break;
            }
        }

        if(!encontrado) {
            System.out.println("NAO ACHEI");
        }
    }
}
