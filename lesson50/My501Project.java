package lesson50;

interface Operation {
    int calculate(int a, int b);
}

public class My501Project {
    public static void main(String[] args) {
        final String input = "10+5";
        final String[] numbers = input.split("[+-/*]");
        final int a = Integer.parseInt(numbers[0]);
        final int b = Integer.parseInt(numbers[1]);
        final int lastNumberIndex = input.indexOf(numbers[1]);
        final String operationString = input.substring(lastNumberIndex - 1, lastNumberIndex);
        Operation sum = new Operation() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };
        Operation minus = new Operation() {
            @Override
            public int calculate(int a, int b) {
                return a - b;
            }
        };
        Operation multiply = new Operation() {
            @Override
            public int calculate(int a, int b) {
                return a * b;
            }
        };
        Operation divide = new Operation() {
            @Override
            public int calculate(int a, int b) {
                return a / b;
            }
        };

        Operation operation = null;
        switch (operationString) {
            case "+":
                operation = sum;
                break;
            case "-":
                operation = minus;
                break;
            case "*":
                operation = multiply;
                break;
            case "/":
                operation = divide;
                break;
        }
        System.out.println(operation.calculate(a, b));
    }
}
