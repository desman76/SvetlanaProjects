package lesson51;

import java.util.Scanner;
import java.util.function.Function;

public class My511Project {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите число: ");
    int number = scanner.nextInt();

    Function<Integer, String> checkNumber = (num) -> {
        if (num > 0) {
            return "Положительное число";
        } else if (num < 0) {
            return "Отрицательное число";
        } else {
            return "Ноль";
        }
    };
    System.out.println(checkNumber.apply(number));
    scanner.close();
}
}
