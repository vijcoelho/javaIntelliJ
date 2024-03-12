public class Funcionario {

    private String nome;
    private String cpf;
    protected double salario;

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        setSalario(salario);
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario <= 0) {
            throw new IllegalArgumentException("O salario nao pode ser menor ou igual a 0");
        }
        this.salario = salario;
    }

    public double calcularBonificacao() {
        return this.salario * 0.10;
    }
}
