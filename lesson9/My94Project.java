package lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class My94Project {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String read = reader.readLine();
        String[] strings = read.split(" ");
        if (strings.length <= 1) {
            System.out.println("Нужно ввести 2 слова через пробел");
        } else {
            System.out.println(strings[0]);
        }
    }
}
