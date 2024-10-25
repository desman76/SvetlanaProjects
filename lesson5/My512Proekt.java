package lesson5;

public class My512Proekt {
    public static void main(String[] args) {
        double random = Math.random();
        double randomBig = random*11+12;
        int randomBigFloor = (int) Math.floor(randomBig);
        System.out.println(randomBigFloor);
    }
}

