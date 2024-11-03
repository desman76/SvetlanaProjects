package lesson13;

import java.util.Scanner;

public class My135Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        for (int i = 0; i < Math.min(3, words.length); i++) {
            System.out.println(words[i]);
        }
    }
}



