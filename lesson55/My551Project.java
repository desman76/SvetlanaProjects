package lesson55;

import java.util.ArrayList;
import java.util.Locale;

public class My551Project {
    public static void main(String[] args) {
        ArrayList<Product> catalog = new ArrayList<>();
        catalog.add(new Product("Nokia3310", 12546));
        catalog.add(new Product("Samsung Galaxy S10", 2546));
        catalog.add(new Product("IPhone20", 946587));
        catalog.add(new Product("Gougle Pixel", 4657));
        catalog.stream().map((product -> product.name.toUpperCase(Locale.ROOT))).forEach(System.out::println);

    }
}
class Product {
    String name;
    double price;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}