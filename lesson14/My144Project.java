package lesson14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class My144Project {
    public static void main(String[] args) {
        double[] numbers = new double[10];
        String filePath = "файл14.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            for (int i = 0; i < 10; i++) {
                String line = br.readLine();
                if (line != null) {
                    numbers[i] = Double.parseDouble(line);
                } else {
                    System.out.println("Недостаточно чисел в файле.");
                    return;
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
            return;
        }

        System.out.println("Числа больше числа π:");
        for (double number : numbers) {
            if (number > Math.PI) {
                System.out.println(number);
            }
        }
    }
}



