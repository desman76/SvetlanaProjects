package lesson15;

import java.util.Scanner;

public class My154Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово: ");
        final String srt = sc.nextLine();
        final char [] chars = srt.toCharArray();
        final boolean [] seen = new boolean[33];
        final int aChar = 'а';
        int uniq = 0;
        for (final char ch : chars) {
            int index = ch - aChar;
            if (!seen[index]) {
                seen[index] = true;
                uniq++;
            }
        }
        System.out.println(uniq);

    }

}

