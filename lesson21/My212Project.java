package lesson21;

import java.util.Scanner;

public class My212Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder phrase = new StringBuilder();
        System.out.println("Введите три слова: ");
        for (int i = 0; i < 3; i++) {
            String line = sc.nextLine();
            phrase.append(line + " ");
        }
        String[] words = phrase.toString().trim().split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
