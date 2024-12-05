package lesson34;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class My342Project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] fileNames = new String[5];

        System.out.println("Введите 5 названий файлов:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Файл " + (i + 1) + ": ");
            fileNames[i] = scanner.nextLine();
        }

        for (String fileName : fileNames) {
            BufferedWriter writer = null;
            try {
                writer = new BufferedWriter(new FileWriter(fileName));
                for (String name : fileNames) {
                    writer.write(name);
                    writer.newLine();
                }
                System.out.println("Записано в файл: " + fileName);
            } catch (IOException e) {
                System.out.println("Ошибка при записи в файл: " + fileName);
                e.printStackTrace();
            } finally {
                if (writer != null) {
                    try {
                        writer.close();
                    } catch (IOException e) {
                        System.out.println("Ошибка при закрытии файла: " + fileName);
                        e.printStackTrace();
                    }
                }
            }
        }
        scanner.close();
    }
}