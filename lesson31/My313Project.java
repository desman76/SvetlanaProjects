package lesson31;

import java.time.ZonedDateTime;
import java.time.Duration;
import java.time.ZoneId;

public class My313Project {
    public static void main(String[] args) {
        ZonedDateTime departureTime = ZonedDateTime.of(2020, 1, 1, 12, 0, 0, 0, ZoneId.of("Europe/Moscow"));
        Duration flightDuration = Duration.ofHours(10).plusMinutes(15);
        ZonedDateTime arrivalTime = departureTime.plus(flightDuration);

        arrivalTime = arrivalTime.withZoneSameInstant(ZoneId.of("Asia/Vladivostok"));

        System.out.println("Время прибытия во Владивосток: " + arrivalTime);
    }
}
