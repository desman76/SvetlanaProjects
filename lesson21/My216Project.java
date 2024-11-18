package lesson21;

import java.util.Scanner;

public class My216Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder word = new StringBuilder();
        System.out.println("Введите число: ");
        int number = sc.nextInt();
        word.append(sc.nextLine());
        word.append("программист");
        System.out.println(word);
    }
}
