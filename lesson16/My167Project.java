package lesson16;

import java.util.Scanner;

public class My167Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дробное число: ");
        String str = sc.nextLine();
        int dotIndex = 0;
        int i=0;
        while (i < str.length() && dotIndex ==0) {
            if (str.charAt(i) == '.') {
                dotIndex=i;
            }
            i++;
        }
        char [] intPart = new char [dotIndex];
        char [] fractPart = new char [str.length()-dotIndex-1];
        for (int x=0; x<dotIndex; x++) {
            intPart[x] = str.charAt(x);
        }
        for (int x=dotIndex+1; x<str.length(); x++) {
            fractPart[x-dotIndex-1] = str.charAt(x);
        }
        System.out.println(fractPart);
    }
}
