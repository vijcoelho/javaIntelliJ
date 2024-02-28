package Class;

public class Pessoa {

    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public Pessoa(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public void envelhecer(int novaIdade) {
        if (this.idade < 21 || novaIdade < 21) {
            crescer(0.05);
        }
        this.idade = novaIdade;
    }

    public void engordar(double novoPeso) {
        this.peso += novoPeso;
    }

    public void emagrecer(double malhando) {
        this.peso -= malhando;
    }

    public void crescer(double novaAltura) {
        this.altura += novaAltura;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }
}
