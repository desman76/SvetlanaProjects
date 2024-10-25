package lesson6;

import java.util.Scanner;

public class My62Projekt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите пожалуйста строку:");
        String str = sc.nextLine();
        if (str.contains(" ")){
            System.out.println("Вы ввели несколько слово");
        } else {
            System.out.println("Вы ввели одно слов");
        }
    }
}
