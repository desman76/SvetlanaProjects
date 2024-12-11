package lesson39;

public class My392Project {
    public static void main(String[] args) {
        MorseDecoder morseDecoder = new MorseDecoder();

        String original = "HELLO WORLD";
        String encoded = morseDecoder.encode(original);
        String decoded = morseDecoder.decode(encoded);

        System.out.println("Original: " + original);
        System.out.println("Encoded (Morse): " + encoded);
        System.out.println("Decoded: " + decoded);
    }
}

