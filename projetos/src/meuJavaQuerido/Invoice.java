package meuJavaQuerido;

public class Invoice {
    private int id;
    private Customer customer;
    private int nProducts = 0;
    private Product[] products;
    private int[] quantities;

    public Invoice(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }
}
