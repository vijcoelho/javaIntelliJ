package meuJavaQuerido;

import java.util.Arrays;

public class Invoice {
    private int id;
    private Customer customer;
    private int nProducts = 0;
    private Product[] products;
    private int[] quantities;

    public Invoice(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
        this.products = new Product[5];
        this.quantities = new int[5];
    }

    public double getTotal() {
        double total = 0.0;
        for (int i = 0; i < this.nProducts; i++) {
            total += this.products[i].getPrice() * this.quantities[i];
        }
        return total;
    }

    public double getTotalAfterDiscount() {
        return (1 - (double) this.customer.getDiscount() / 100) * this.getTotal();
    }

    public boolean addProduct(Product product, int amount) {
        for (int i = 0; i < this.nProducts; i++) {
            if (products[i].equals(product)) {
                return false;
            }
        }
        this.products[this.nProducts] = product;
        this.quantities[this.nProducts] = amount;
        this.nProducts++;
        return true;
    }

    public boolean removeProduct(Product product) {
        boolean found = false;
        int index = -1;
        for (int i = 0; i < this.nProducts; i++) {
            if (products[i].equals(product)) {
                found = true;
                index = i;
                break;
            }
        }
        if (found) {
            for (int i = 0; i < this.nProducts; i++) {
                this.products[i] = this.products[i + 1];
                this.quantities[i] = this.quantities[i + 1];
            }
            this.nProducts--;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", customer=" + customer +
                ", nProducts=" + nProducts +
                ", products=" + Arrays.toString(products) +
                ", quantities=" + Arrays.toString(quantities) +
                '}';
    }
}
