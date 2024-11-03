package lesson13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class My137Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Character, String> wordsMap = new HashMap<>();
        wordsMap.put('a', "арбуз");
        wordsMap.put('б', "банан");
        wordsMap.put('в', "виноград");
        wordsMap.put('г', "гриб");
        wordsMap.put('д', "динозавр");
        wordsMap.put('е', "ель");
        wordsMap.put('ё', "ёжик");
        wordsMap.put('ж', "жизнь");
        wordsMap.put('з', "заря");
        wordsMap.put('и', "икра");
        wordsMap.put('й', "йог");
        wordsMap.put('к', "канава");
        wordsMap.put('л', "лимон");
        wordsMap.put('м', "мармелад");
        wordsMap.put('н', "носок");
        wordsMap.put('о', "огниво");
        wordsMap.put('п', "паяльник");
        wordsMap.put('р', "ребус");
        wordsMap.put('с', "стомеска");
        wordsMap.put('т', "танк");
        wordsMap.put('у', "утварь");
        wordsMap.put('ф', "филин");
        wordsMap.put('х', "халва");
        wordsMap.put('ц', "цапля");
        wordsMap.put('ч', "черепаха");
        wordsMap.put('ш', "шишка");
        wordsMap.put('щ', "щавель");
        wordsMap.put('э', "эрудит");
        wordsMap.put('ю', "юла");
        wordsMap.put('я', "яблоко");

        System.out.println("Введите букву: ");
        char letter = sc.nextLine().toLowerCase().charAt(0);

        if (wordsMap.containsKey(letter)) {
            System.out.println(wordsMap.get(letter));
        } else {
            System.out.println("Нет слова, начинающегося на букву '" + letter + "'.");
        }
    }
}

