package lesson21;

import java.util.Scanner;

public class My211Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder poem = new StringBuilder();
        System.out.println("Введите стихотворение: ");
        for (int i = 0; i < 4; i++) {
            String line = sc.nextLine();
            poem.append(line + "\n");

        }
        String str = poem.toString();
        System.out.println(str);
    }
}
