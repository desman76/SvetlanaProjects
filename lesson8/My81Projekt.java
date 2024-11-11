package lesson8;

import java.util.Scanner;

public class My81Projekt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int max = (x>y) ? x : y;
        System.out.println(max);
    }
}
