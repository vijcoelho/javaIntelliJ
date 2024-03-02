package meuJavaQuerido;

public class Main {
    public static void main(String[] args) {
        Product coxinha = new Product(1, "Coxinha", 6.50);
        Product chocolate = new Product(2, "Chocolate", 15.50);

        Customer customer = new Customer(1, "Durga", 10);
        System.out.println(customer.getDiscount());

        Invoice invoice = new Invoice(1, customer);

        invoice.addProduct(coxinha, 2);
        invoice.addProduct(chocolate, 1);

        System.out.println(invoice.getTotal());
        System.out.printf("Discount: %.2f \n", invoice.getTotalAfterDiscount());

        System.out.println(invoice.toString());
    }
}
