package lesson39;

import java.util.HashMap;
import java.util.Map;

public class MorseDecoder implements Decoder {
    private final Map<Character, String> encodeMap;
    private final Map<String, Character> decodeMap;
    public MorseDecoder() {
        encodeMap = new HashMap<>();
        decodeMap = new HashMap<>();
        encodeMap.put('A', ".-");
        encodeMap.put('B', "-...");
        encodeMap.put('C', "-.-.");
        encodeMap.put('D', "-..");
        encodeMap.put('E', ".");
        encodeMap.put('F', "..-.");
        encodeMap.put('G', "--.");
        encodeMap.put('H', "....");
        encodeMap.put('I', "..");
        encodeMap.put('J', ".---");
        encodeMap.put('K', "-.-");
        encodeMap.put('L', ".-..");
        encodeMap.put('M', "--");
        encodeMap.put('N', "-.");
        encodeMap.put('O', "---");
        encodeMap.put('P', ".--.");
        encodeMap.put('Q', "--.-");
        encodeMap.put('R', ".-.");
        encodeMap.put('S', "...");
        encodeMap.put('T', "-");
        encodeMap.put('U', "..-");
        encodeMap.put('V', "...-");
        encodeMap.put('W', ".--");
        encodeMap.put('X', "-..-");
        encodeMap.put('Y', "-.--");
        encodeMap.put('Z', "--..");
        encodeMap.put('1', ".----");
        encodeMap.put('2', "..---");
        encodeMap.put('3', "...--");
        encodeMap.put('4', "....-");
        encodeMap.put('5', ".....");
        encodeMap.put('6', "-....");
        encodeMap.put('7', "--...");
        encodeMap.put('8', "---..");
        encodeMap.put('9', "----.");
        encodeMap.put('0', "-----");
        encodeMap.put(' ', "/"); // Пробел

        for (Map.Entry<Character, String> entry : encodeMap.entrySet()) {
            decodeMap.put(entry.getValue(), entry.getKey());
        }
    }
    @Override
    public String encode(String source) {
        StringBuilder encoded = new StringBuilder();
        source = source.toUpperCase();
        for (char c : source.toCharArray()) {
            String encodedChar = encodeMap.get(c);
            if (encodedChar != null) {
                encoded.append(encodedChar).append(" ");
            }
        }
        return encoded.toString().trim();
    }
    @Override
    public String decode(String encoded) {
        StringBuilder decoded = new StringBuilder();
        String[] morseChars = encoded.split(" ");

        for (String morseChar : morseChars) {
            Character decodedChar = decodeMap.get(morseChar);
            if (decodedChar != null) {
                decoded.append(decodedChar);
            } else if (morseChar.equals("/")) {
                decoded.append(" ");
            }
        }
        return decoded.toString();
    }
}

