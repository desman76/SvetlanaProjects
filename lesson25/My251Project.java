package lesson25;

public class My251Project {
    public static void main(String[] args) {
        int size = 10;
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();
        for (int row = 2; row < size; row++) {
            for (int col = 1; col < size; col++) {
                int mult = row * col;
                if (mult>=10) {
                    System.out.print(mult + " ");
                } else {
                    System.out.print(mult + "  ");
                }
            }
            System.out.println();
        }
    }
}
