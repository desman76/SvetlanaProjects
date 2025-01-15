package lesson52;

import java.util.Arrays;
import java.util.stream.Collectors;

public class My521Project {
    public static void main(String[] args) {
       String[] words = {"I", "LOVE", "JAVA"};
       String result = Arrays.stream(words)
                .collect(Collectors.joining(" "));

        System.out.println(result);
    }
}
