package lesson21;

import java.util.Scanner;

public class My215Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder words = new StringBuilder();
        System.out.println("Введите фразу из двух слов: ");
        String input = sc.nextLine();

        String[] splitWords = input.split(" ");

        words.append(splitWords[0]).append(" ,так сказать, ").append(splitWords[1]);
        System.out.println(words.toString());
    }
}
