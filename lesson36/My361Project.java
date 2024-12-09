package lesson36;

public class My361Project {
    public static void main(String[] args) {
        String str = null;

        try {
            int length = str.length();
        } catch (NullPointerException e) {
            System.out.println("Выброшено исключение: " + e);
        }
    }
}
