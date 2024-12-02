package lesson31;

import java.time.LocalDate;
import java.time.Month;

public class My311Project {
    public static void main(String[] args) {
        LocalDate end2024 = LocalDate.of(2024, Month.DECEMBER, 31);
        LocalDate currentDate = LocalDate.of(2024, Month.JANUARY, 1);

        while (currentDate.isBefore(end2024)) {
            System.out.println(currentDate);
            currentDate = currentDate.plusDays(1);
        }
    }
}
