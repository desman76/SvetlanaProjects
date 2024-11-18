package lesson21;

import java.util.Scanner;

public class My217Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите предложение: ");
        String input = sc.nextLine();

        String result = input.replace(" ", "");

        System.out.println(result);
    }
}
