package TestClass;

import Class.Calculator;

import java.util.Scanner;

public class TestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculator calculator = new Calculator();

        System.out.println("Enter number 1 and number 2: ");
        float number1 = scanner.nextFloat();
        float number2 =  scanner.nextFloat();

        calculator.setNum(number1, number2);

        System.out.println(calculator.operations());

        System.out.print("Enter operation: ");
        String question = scanner.next();
        calculator.ask(question);
    }
}
