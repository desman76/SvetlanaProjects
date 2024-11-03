package lesson13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class My138Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите цифру: ");
        Map<Character, String> countryCodes = new HashMap<>();
        countryCodes.put('1', "США");
        countryCodes.put('2', "Египет");
        countryCodes.put('3', "Франция");
        countryCodes.put('4', "Великобритания");
        countryCodes.put('5', "Перу");
        countryCodes.put('6', "Австралия");
        countryCodes.put('7', "Россия");
        countryCodes.put('8', "Япония");

        char x = sc.nextLine().charAt(0);

        if (countryCodes.containsKey(x)) {
            System.out.println(countryCodes.get(x));
        } else {
            System.out.println("Нет страны с телефонным кодом, начинающимся на '" + x + "'.");
        }
    }
}


