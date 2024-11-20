package lesson25;

public class My259Project {
    public static void main(String[] args) {
        char[][] array = new char[6][6];
        char ch = 'а';
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                array[i][j] = ch;
                ch++;
                if (ch > 'я') {
                    ch = 'а';
                }
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
