package lesson39;

import java.util.HashMap;
import java.util.Map;

public class CustomDecoder implements Decoder {
    private final Map<Character, String> encodeMap;
    private final Map<String, Character> decodeMap;

    public CustomDecoder() {
        encodeMap = new HashMap<>();
        decodeMap = new HashMap<>();

        encodeMap.put('ш', "w");
        encodeMap.put('г', "r");
        encodeMap.put('а', "a");
        encodeMap.put('б', "b");
        encodeMap.put('в', "v");
        encodeMap.put('д', "d");
        encodeMap.put('е', "e");

        for (Map.Entry<Character, String> entry : encodeMap.entrySet()) {
            decodeMap.put(entry.getValue(), entry.getKey());
        }
    }

    @Override
    public String encode(String source) {
        StringBuilder encoded = new StringBuilder();
        for (char c : source.toCharArray()) {
            String encodedChar = encodeMap.get(c);
            if (encodedChar != null) {
                encoded.append(encodedChar);
            } else {
                encoded.append(c);
            }
        }
        return encoded.toString();
    }

    @Override
    public String decode(String encoded) {
        StringBuilder decoded = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for (char c : encoded.toCharArray()) {
            temp.append(c);
            if (decodeMap.containsKey(temp.toString())) {
                decoded.append(decodeMap.get(temp.toString()));
                temp.setLength(0);
            }
        }
        decoded.append(temp.toString());
        return decoded.toString();
    }
}