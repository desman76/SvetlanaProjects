package lesson33;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class My336Project {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Введите имя файла: ");
        String fileName = inputScanner.nextLine();
        File file = new File(fileName);
        try {
            Scanner fileScanner = new Scanner(file);
            System.out.println("Содержимое файла:");

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + fileName);
        } finally {
            inputScanner.close();
        }
    }
}
