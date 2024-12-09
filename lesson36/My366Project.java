package lesson36;

public class My366Project {
    public static void main(String[] args) {
        Integer[] numbers = {null, null, null, null, null};
        int sum = 0;
        for (Integer number : numbers) {
            if (number != null) {
                sum += number;
            }
        }
        System.out.println("Сумма: " + sum);
    }
}
