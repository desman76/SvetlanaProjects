package lesson16;

import java.util.Scanner;

public class My163Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово:");
        String str = sc.nextLine();
        char firstVowel = '\0';
        String vowels = "аеёиоуыэюяАЕЁИОУЫЭЮЯ";

        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                firstVowel = c;
                break;
            }
        }
        if (firstVowel != '\0') {
            System.out.println("Первая гласная: " + firstVowel);
        }
        }
    }

