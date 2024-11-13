package lesson20;

public class My201Project {
    private int num1;
    private int num2;
    private int num3;

    public My201Project(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
      public int findMax() {
        int max = this.num1;

        if (this.num2 > max) {
            max = this.num2;
        }
        if (this.num3 > max) {
            max = this.num3;
        }

        return max;
    }

    public static void main(String[] args) {
        My201Project maxFinder = new My201Project(10, 20, 15);
        System.out.println("Наибольшее число: " + maxFinder.findMax());
    }
}

