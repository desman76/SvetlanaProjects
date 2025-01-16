package lesson53;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class My531Project {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> randomNumbers = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            randomNumbers.add(random.nextInt(21) - 10);
        }

        List<Integer> positiveNumbers = new ArrayList<>();
        for (Integer num : randomNumbers) {
            if (num > 0) {
                positiveNumbers.add(num);
            }
        }
        Collections.sort(positiveNumbers);
        positiveNumbers.forEach(System.out::println);
    }
}
