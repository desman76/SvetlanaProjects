package lesson54;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class My541Project {
    public static void main(String[] args) {
        List<String> smartphones = Arrays.asList(
                "iPhone 6 S",
                "Lumia 950",
                "Samsung Galaxy S 6",
                "LG G 4",
                "Nexus 7"
        );

        List<String> result = smartphones.stream()
                .skip(1)
                .limit(2)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
