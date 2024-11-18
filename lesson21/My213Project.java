package lesson21;

import java.util.Scanner;

public class My213Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder  word = new StringBuilder();
        System.out.println("Введите слово: ");
        word.append("Вы говорите: ");
        word.append(sc.nextLine());
        word.append(", и что?");

        System.out.println(word);
            }
}
