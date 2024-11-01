package lesson12;

public class My126Project {
    public static void main(String[] args) {
        for (char letter = 'а'; letter <= 'я'; letter++) {
            if ((letter - 'а') % 2 == 1) {
                System.out.println(letter + " ");
            }
        }
    }
}
