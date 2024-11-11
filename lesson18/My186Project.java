package lesson18;

import java.util.Scanner;

public class My186Project {
    public static void main(String[] args) {
        String str = readString();
        String redactor = redacString (str);
        System.out.println(redactor);
    }
    public static String readString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        return sc.nextLine();
    }
    public static String redacString(String str) {
        char[] chars = str.toCharArray();
        int size = chars.length;
        for (int i = 0; i < size; i++) {
            if (i%2==0) {
                chars[i] = Character.toUpperCase(chars[i]);
            } else {
                chars[i] = Character.toLowerCase(chars[i]);
            }
        }
        return new String(chars);
    }
}
