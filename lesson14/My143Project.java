package lesson14;

import java.util.Scanner;

public class My143Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 10 строк:");
        String[] strings = new String[10];

            for (int i = 0; i < 10; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            strings[i] = sc.nextLine();
        }
        System.out.println("Каждая вторая строка в обратном порядке:");
        for (int i = 8; i >= 0; i -= 2) {
            System.out.println(strings[i]);
        }

    }
}
