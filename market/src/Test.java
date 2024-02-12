import DAO.UserController;
import Model.Product;
import Model.User;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        User user = new User();
        UserController userController = new UserController();

        String name = scanner.next();
        String email = scanner.next();
        String password = scanner.next();

        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);

        userController.newUser(user);
    }
}
