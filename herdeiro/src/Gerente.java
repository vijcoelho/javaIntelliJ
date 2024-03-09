public class Gerente extends Funcionario {

    private int numeroDeFuncionariosGerenciados = 0;

    public Gerente(String nome, String cpf) {
        super(nome, cpf);
    }

    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public Gerente(String nome, String cpf, int numeroDeFuncionariosGerenciados) {
        super(nome, cpf);
        if (numeroDeFuncionariosGerenciados <= 0) {
            throw new IllegalArgumentException("Numero de funcionarios gerenciados nao pode ser menor ou igual a 0!");
        }
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }

    public int getNumeroDeFuncionariosGerenciados() {
        return this.numeroDeFuncionariosGerenciados;
    }

    public double calcularBonificacao() {
        return this.getSalario() * 0.15;
    }
}
