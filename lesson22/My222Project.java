package lesson22;

import java.util.Scanner;

public class My222Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 10 чисел: ");
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("result: ");
        for (int i = 0; i < 10; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println("первое четное число: " + numbers[i]);
                break;
            }


        }
    }
}
