package lesson5;

import java.util.Scanner;

public class My53Proekt {
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
        System.out.print(Math.pow(Math.pow(x, y),z));
    }
}
