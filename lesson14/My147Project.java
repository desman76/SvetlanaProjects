package lesson14;

import java.util.Scanner;

public class My147Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Игрок 1, введите слово: ");
        String word = sc.nextLine().toLowerCase();
        char[] wordArray = word.toCharArray();
        char[] displayArray = new char[word.length()];
        for (int i = 0; i < displayArray.length; i++) {
            displayArray[i] = '#';
        }

        while (new String(displayArray).contains("#")) {
            System.out.println("Текущее слово: " + new String(displayArray));
            System.out.print("Игрок 2, введите букву: ");
            char guess = sc.nextLine().toLowerCase().charAt(0);

            boolean found = false;

            for (int i = 0; i < wordArray.length; i++) {
                if (wordArray[i] == guess) {
                    displayArray[i] = guess;
                    found = true;
                }
            }

            if (!found) {
                System.out.println("Буква '" + guess + "' не угадана.");
            }
        }

        System.out.println("Поздравляем! Вы угадали слово: " + word);
    }
}
