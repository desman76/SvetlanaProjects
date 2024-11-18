package lesson21;

import java.util.Scanner;

public class My214Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder words = new StringBuilder();
        System.out.print("Введите 5 слов : ");
        for (int i = 0; i < 5; i++) {
            if (i > 0) {
                words.append(" , и ");
            }
            words.append(sc.nextLine());
        }
        System.out.println(words);
    }
}
