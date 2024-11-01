package lesson12;

public class My125Project {
    public static void main(String[] args) {
        char lastLetter = 'ю';
        for (int i = 1; i <= 10; i++) {
            char letter = (char) (lastLetter - i);
            System.out.println(letter + " ");
        }
    }
}
