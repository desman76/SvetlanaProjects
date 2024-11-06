package lesson16;

import java.util.Scanner;

public class My164Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово:");
        String str = sc.nextLine();
        int consonantCount = 0;
        String vowels = "аеёиоуыэюяАЕЁИОУЫЭЮЯ";

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c) && vowels.indexOf(c) == -1) {
                consonantCount++;
            }
        }

        System.out.println("Количество согласных букв: " + consonantCount);
    }
}
