package lesson5;

public class My59Proekt {
    public static void main(String[] args) {
        double random = Math.random();
        double randomBig = random*25+97;
        int randomBigFloor = (int) Math.floor(randomBig);
        char letter = (char) randomBigFloor;
        System.out.println(letter);
    }
}
