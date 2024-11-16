package lesson22;

import java.util.Scanner;

public class My224Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 10 слов: ");
        String[] words = new String[10];

        for (int i = 0; i < 10; i++) {
            words[i] = sc.next();
        }

        System.out.println("Результат: ");
        String lastMatchingWord = null;

        for (int i = 0; i < 10; i++) {
            if (isMatchingFormat(words[i])) {
                lastMatchingWord = words[i];
            }
        }

        if (lastMatchingWord != null) {
            System.out.println("Последнее слово, написанное 'ЗаБоРчИкОм': " + lastMatchingWord);
        } else {
            System.out.println("Слов, написанных 'ЗаБоРчИкОм', не найдено.");
        }
    }

    private static boolean isMatchingFormat(String word) {
        if (word.length() != 10) return false;
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (i % 2 == 0 && !Character.isUpperCase(letter)) {
                return false;
            }
                if (i % 2 != 0 && Character.isUpperCase(letter)) {
                    return false;
                }
            }

            return true;
        }

    }


