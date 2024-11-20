package lesson25;

public class My256Project {
    public static void main(String[] args) {
        int[][] array = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                array[i][j] = (i+1)*(j+1);
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.printf("%4d", array[i][j]);
            }
            System.out.println();
        }
            }

        }


