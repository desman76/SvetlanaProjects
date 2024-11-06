package lesson14;

import java.util.Scanner;

public class My141Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 10 чисел:");
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Число " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();}
            System.out.println("Числа в обратном порядке:");
            for (int i = numbers.length - 1; i >= 0; i--) {
                System.out.println(numbers[i]);
            }
        }
        }



