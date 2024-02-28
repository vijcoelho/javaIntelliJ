package TestClass;

import Class.User;

import java.util.Scanner;

public class TestUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();

        String name = scanner.next();
        int age = scanner.nextInt();
        char sexo = scanner.next().charAt(0);


        user.setName(name);
        user.setAge(age);
        user.setSexo(sexo);

        System.out.println(user.getName()+ "\t " + user.getAge());

    }
}
