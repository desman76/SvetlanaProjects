package lesson39;

public class My391Project {
    public static void main(String[] args) {
        CustomDecoder decoder = new CustomDecoder();

        String original = "шаги";
        String encoded = decoder.encode(original);
        String decoded = decoder.decode(encoded);

        System.out.println("Original: " + original);
        System.out.println("Encoded: " + encoded);
        System.out.println("Decoded: " + decoded);
    }
}
