package lesson25;

public class My253Project {
    public static void main(String[] args) {
        for (int row = 1; row <= 10; row++) {
             for (int j = 1; j <= 10; j++) {
                if (row % 2 == 0 ) {
                    System.out.print('@');
                }else {
                    System.out.print('#');
                }
            }
             System.out.println();
        }
    }
}

