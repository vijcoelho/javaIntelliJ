package TestClass;

import Class.Pessoa;

public class TestPessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Pessoa1", 20, 1.80, 60.5);
        Pessoa pessoa2 = new Pessoa("Pessoa2", 22, 1.83, 70.4);

        pessoa1.engordar(10);
        pessoa1.crescer(0.05);
        pessoa1.envelhecer(22);

        System.out.println(pessoa1.toString());
        System.out.println(pessoa2.toString());
    }
}
