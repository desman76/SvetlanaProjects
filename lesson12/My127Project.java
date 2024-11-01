package lesson12;

public class My127Project {
    public static void main(String[] args) {
        for (char letter = 'a'; letter <= 'z'; letter++) {
            if ((letter - 'b') % 3 == 1) {
                System.out.println(letter);
            }

        }
    }
}
