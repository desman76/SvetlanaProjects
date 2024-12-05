package lesson34;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class My341Project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] fileNames = new String[5];

        System.out.println("Введите 5 названий файлов:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Файл " + (i + 1) + ": ");
            fileNames[i] = scanner.nextLine();
        }

        for (String fileName : fileNames) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                for (String name : fileNames) {
                    writer.write(name);
                    writer.newLine();
                }
                System.out.println("Записано в файл: " + fileName);
            } catch (IOException e) {
                System.out.println("Ошибка при записи в файл: " + fileName);
                e.printStackTrace();
            }
        }

        scanner.close();
    }
}
