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
        this.products = new Product[15];
        this.quantities = new int[15];
    }
}
