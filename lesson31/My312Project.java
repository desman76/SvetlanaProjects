package lesson31;

import java.util.Calendar;

public class My312Project {
    public static void main(String[] args) {
        int year = 2024;

        for (int month = 0; month < 12; month++) {
            printMonth(year, month);
            System.out.println();
        }
    }
    private static void printMonth(int year, int month) {
             String[] months = {
                "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь",
                "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"
        };
        System.out.println(months[month] + " " + year);
        System.out.println("Пн Вт Ср Чт Пт Сб Вс");

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, 1);

        int startDay = calendar.get(Calendar.DAY_OF_WEEK);
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        for (int i = 1; i < startDay; i++) {
            System.out.print("   ");
        }

        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%2d ", day);
            if ((day + startDay - 1) % 7 == 0) {
                System.out.println();
            }
        }
    }
}
