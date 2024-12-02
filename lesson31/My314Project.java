package lesson31;

import java.time.LocalDate;
import java.util.Scanner;

public class My314Project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату (в формате ГГГГ-ММ-ДД): ");
        String inputDate = scanner.nextLine();

        LocalDate date = LocalDate.parse(inputDate);
        LocalDate startOfYear = LocalDate.of(date.getYear(), 1, 1);
        System.out.println("Числа с 1 января " + date.getYear() + " года до " + date + ":");
        for (LocalDate currentDate = startOfYear; !currentDate.isAfter(date); currentDate = currentDate.plusDays(1)) {
            System.out.println(currentDate.getDayOfMonth());
        }

        scanner.close();
    }
}
