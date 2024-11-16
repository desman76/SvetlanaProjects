package lesson22;

public class My225Project {
    public static void main(String[] args) {
        int number = 1;
        while (true) {
            System.out.println(number);
            if (sumOfDigits(number) == 20) {
                break;
            }
            number++;
        }
    }
    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}


