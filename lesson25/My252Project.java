package lesson25;

public class My252Project {
    public static void main(String[] args) {
        int size = 20;
        for (int i = 1; i < 10; i++) {
            System.out.print(i + "   ");
        }
        for (int i = 10; i < 20; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();
        for (int row = 2; row < size; row++) {
            for (int col = 1; col < size; col++) {
                int mult = row * col;
                if (mult>=100) {
                    System.out.print(mult + " ");
                } else if (mult >= 10) {
                    System.out.print(mult + "  ");
                } else {
                    System.out.print(mult + "   ");
                }
            }
            System.out.println();
        }
    }
}
