package Lesson23;

public class My231Project {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 3;
        int num3 = 2;

        int result = findDivisible(num1, num2, num3);
        if (result != -1) {
            System.out.println("Число, которое делится на два остальных: " + result);
        } else {
            System.out.println("Нет числа, которое делится на два остальных.");
        }
    }
    public static int findDivisible(int a, int b, int c) {
        if (a % b == 0 && a % c == 0) {
            return a;
        } else if (b % a == 0 && b % c == 0) {
            return b;
        } else if (c % a == 0 && c % b == 0) {
            return c;
        } else {
            return -1;
        }

    }
}
