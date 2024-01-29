package Class;

public class Calculator {

    private float number1, number2;

    public void setNum(float number1, float number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public float addition() {
        return number1 + number2;
    }

    public float subtraction() {
        return number1 - number2;
    }

    public float multiplication() {
        return number1 * number2;
    }

    public float division() {
        if(number1 == 0 || number2 == 0) {
            System.out.println("You CAN'T");
        }
        return number1 / number2;
    }

    public String operations() {
        return """
                + ADDITION
                * MULTIPLICATION
                / DIVISION
                - SUBTRACTION
                """;
    }

    public void ask(String quest) {
        float result = 0;

        switch (quest) {
            case "+":
                result = addition();
                break;
            case "*":
                result = multiplication();
                break;
            case "/":
                result = division();
                break;
            case "-":
                result = subtraction();
                break;
            default:
                break;
        }

        System.out.println("Your result is: " + result);
    }
}

