import Model.Product;
import Model.User;

public class Test {
    public static void main(String[] args) {

        User user = new User();
        user.setEmail("email@email.com");
        user.setName("NameTest");
        user.setPassword("TestPassword");

        System.out.println(user.toString());

        Product product = new Product();
        product.setNameProduct("Socks");
        product.setPrice(10.99);
        product.setAmount(10);

        System.out.println(product.toString());
    }
}
