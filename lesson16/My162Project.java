package lesson16;

import java.util.Scanner;

public class My162Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        String a = sc.nextLine();
        int zeroCount = 0;

        for (char c : a.toCharArray()) {
            if (c == '0') {
                zeroCount++;
            }
        }
        System.out.println("Количество нулей в числе: " + zeroCount);

    }
}
