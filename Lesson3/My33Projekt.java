package Lesson3;

import java.util.Scanner;

public class My33Projekt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Пожалуйста введите строку1: ");
        String str = sc.nextLine();
        int a = str.length();
        System.out.println("Пожалуйста введите строку2");
        String str2 = sc.nextLine();
        int b = str2.length();
        System.out.println("Пожалуйста введите строку3");
        String str3 = sc.nextLine();
        int c = str3.length();
        if (a<b && a<c){
            System.out.println(str);
                  }else if (b<c){
            System.out.println(str2);
        }else {
            System.out.println(str3);
        }
    }
}
