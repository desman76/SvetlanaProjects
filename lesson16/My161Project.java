package lesson16;

import java.util.Scanner;

public class My161Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 5 строк");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();
        String str4 = sc.nextLine();
        String str5 = sc.nextLine();
        StringBuilder result = new StringBuilder();

        result.append(str1.charAt(0));
        result.append(str2.charAt(0));
        result.append(str3.charAt(0));
        result.append(str4.charAt(0));
        result.append(str5.charAt(0));

        System.out.println(result.toString());
        }
    }

