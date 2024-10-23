package lesson5;

import java.util.Scanner;

public class My52Proekt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter x: ");
        int x = scan.nextInt();
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Please enter y: ");
        int y = scan1.nextInt();
        Scanner scan2 = new Scanner(System.in);
        System.out.print("Please enter z: ");
        int z = scan1.nextInt();
        int n= (int) Math.pow(x, y);
        System.out.print(Math.pow(n, z));
    }
}
