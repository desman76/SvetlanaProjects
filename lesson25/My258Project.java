package lesson25;

public class My258Project {
    public static void main(String[] args) {
        char[][] array = new char[5][5];
        char ch = 'a';
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = ch;
                ch++;
                if (ch > 'z') {
                    ch = 'a';
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
