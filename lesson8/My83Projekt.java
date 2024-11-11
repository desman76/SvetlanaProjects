package lesson8;

import java.util.Scanner;

public class My83Projekt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int max= (x>y&&x>z)?x:(y>z&&y>x)?y:z;
        System.out.println(max);
    }
}
