package lesson57;

import java.util.stream.IntStream;

public class My57Project {
    public static void main(String[] args) {
        IntStream.range(-10, 10).map(x-> x*x-5*x-10).filter(x->x<10).max().ifPresentOrElse((n)->System.out.println(n+n),()->System.out.println("Число не найдено"));
    }
}
