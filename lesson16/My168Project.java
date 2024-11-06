package lesson16;

import java.util.Scanner;

public class My168Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите предложение:");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            int size = word.length();
            if (size > 2) {
               word = word.substring(0, size - 2) + "**";
            } else if (size == 2) {
               word = "**";
            }
            result.append(word).append(" ");
        }
        System.out.println(result.toString().trim());

    }
    }
