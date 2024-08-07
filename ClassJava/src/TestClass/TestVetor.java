package TestClass;

import Class.Vetor;

public class TestVetor {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        System.out.println(vetor.add(1));
        System.out.println(vetor.remove(1));
        vetor.showArr();
    }
}
