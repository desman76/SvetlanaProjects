package lesson14;

import java.util.Scanner;

public class My145Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] letters = new char[100];
        int count = 0;
        System.out.println("Введите буквы:");
        while (count < letters.length) {
            char input = sc.next().charAt(0);
            if (input == 'ю') {
                break;
            }
            letters[count] = input;
            count++;
        }
        char[] newLetters = new char[count];
        for (int i = 0; i < count; i++) {
            newLetters[i] = letters[i];
        }
        System.out.println("Введенные буквы:");
        for (char letter : newLetters) {
            System.out.println(letter);
        }
    }
}
