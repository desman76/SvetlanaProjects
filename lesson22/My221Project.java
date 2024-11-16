package lesson22;

import java.util.Scanner;

public class My221Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 10 слов: ");
        String [] words = new String[10];
        for (int i = 0; i < 10; i++) {
            words[i] = sc.nextLine();
        }

        String result = findFirstDoubleVowel(words);
        if (result != null) {
            System.out.println("Первое слово с двумя гласными подряд: " + result);
        } else {
            System.out.println("Слов с двумя гласными подряд не найдено.");
        }
    }

    private static String findFirstDoubleVowel(String[] words) {
        String vowels = "аеёиоуыэюяАЕЁИОУЫЭЮЯ";
        for (String word : words) {
            for (int i = 0; i < word.length() - 1; i++) {
                if (vowels.indexOf(word.charAt(i)) != -1 && vowels.indexOf(word.charAt(i + 1)) != -1) {
                    return word;
                }
            }
        }
        return null;
    }

}
