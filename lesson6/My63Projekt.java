package lesson6;

import java.util.Scanner;

public class My63Projekt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a:");
        int a = scanner.nextInt();
        System.out.print("b:");
        int b = scanner.nextInt();
        System.out.print("c:");
        int c = scanner.nextInt();
        System.out.print("d:");
        int d = scanner.nextInt();
        int result;

        if ( a > b ) {
            if ( a > c ) {
                if ( a > d ) {
                    result = a;
                } else {
                    result = d;}
            } else if ( c > d ) {
                result = c;
            } else {
                result = d;
            }
        } else if ( b > c ) {
            if ( b > d ) {
                result = b;
            } else {
                result = d;
            }
        } else if ( c > d ) {
            result = c;
        } else {
            result = d;
        }
        System.out.print("Max is:"+ result);
                }
            }




