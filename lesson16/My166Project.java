package lesson16;

import java.util.Scanner;

public class My166Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово:");
        String str = sc.nextLine();
        String vowels = "аеёиоуыэюяАЕЁИОУЫЭЮЯ";
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                result.append('у');
            } else {
                result.append(c);
            }
        }

        System.out.println(result.toString());
    }
}
