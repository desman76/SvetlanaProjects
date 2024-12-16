package lesson41;

public class My412Project {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");
        StringBuilder sb3 = sb1;

        System.out.println("sb1.equals(sb2): " + sb1.equals(sb2));
        System.out.println("sb1.equals(sb3): " + sb1.equals(sb3));

        System.out.println("sb1.toString().equals(sb2.toString()): " + sb1.toString().equals(sb2.toString()));
    }
}
