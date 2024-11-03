package lesson15;

public class My151Project {
    public static void main(String[] args) {
        final int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }
        for (int i = 0; i < a.length; i++) {
            a[i] *= 2; }
            System.out.println();
        for (int number : a) {
            System.out.println(number);
        }

    }
}

