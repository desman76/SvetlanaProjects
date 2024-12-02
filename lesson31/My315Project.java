package lesson31;

import java.time.Duration;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class My315Project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите часовой пояс (например, Europe/Moscow): ");
        String timeZone = scanner.nextLine();
        System.out.print("Введите время вылета (в формате ЧЧ:ММ): ");
        String departureTimeInput = scanner.nextLine();
        System.out.print("Введите длительность полета (в формате ЧЧ:ММ): ");
        String flightDurationInput = scanner.nextLine();

        LocalTime departureTime = LocalTime.parse(departureTimeInput);
        String[] durationParts = flightDurationInput.split(":");
        Duration flightDuration = Duration.ofHours(Long.parseLong(durationParts[0]))
                .plusMinutes(Long.parseLong(durationParts[1]));

        ZonedDateTime departureZonedDateTime = ZonedDateTime.of(
                ZonedDateTime.now(ZoneId.of(timeZone)).toLocalDate().atTime(departureTime),
                ZoneId.of(timeZone));
        ZonedDateTime arrivalZonedDateTime = departureZonedDateTime.plus(flightDuration);

        System.out.println("Местное время прилета: " + arrivalZonedDateTime.format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));

        scanner.close();
    }
}
