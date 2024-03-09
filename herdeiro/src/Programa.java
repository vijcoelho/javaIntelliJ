public class Programa {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Zé Bento", "123.456.789-10");
        gerente.setSalario(35000);

        Funcionario vendedor = new Vendedor("Cebolinha", "145.675.244.-23");
        vendedor.setSalario(5700);

        System.out.println(gerente.calcularBonificacao());
        System.out.println(vendedor.calcularBonificacao());
    }
}
