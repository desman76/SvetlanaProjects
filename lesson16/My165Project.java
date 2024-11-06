package lesson16;

import java.util.Scanner;

public class My165Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово:");
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        for (int i = str.length()-1; i >=0; i--) {
            System.out.println(chars[i]);
        }
    }
}
