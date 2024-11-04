package Lesson3;

import java.util.Scanner;

public class My37Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число 1:");
        double n = sc.nextInt();
        System.out.println("Введите число2:");
        double m = sc.nextInt();
        if (n<m){
            System.out.println(m/n);
        } else {
            System.out.println(n/m);
        }

    }
}
