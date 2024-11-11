package lesson18;

import java.util.Scanner;

public class My187Project {
    public static void main(String[] args) {
        int [] numbers = readNumbers();;
        int max = findMax (numbers);
        System.out.println("Наибольшее число в массиве: " + max);
    }
    public static int [] readNumbers () {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Введите 10 чисел: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Число " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        return numbers;
    }
        public static int findMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым");
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
