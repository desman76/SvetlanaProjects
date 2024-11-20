package lesson25;

public class My257Project {
    public static void main(String[] args) {
        System.out.print("пн вт ср чт пт сб вс \n");
        int[][] calendar = new int[6][7];

        int day = 1;
        int startDay = 3;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 0 && j < startDay) {
                    calendar[i][j] = 0;
                } else if (day <= 30) {
                    calendar[i][j] = day++;
                }
            }
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (calendar[i][j] == 0) {
                    System.out.print("   ");
                } else {
                    System.out.printf("%2d ", calendar[i][j]);
                }
            }
            System.out.println();
        }
        }
    }

