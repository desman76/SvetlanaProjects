package lesson9;

import java.io.DataInputStream;
import java.io.IOException;

public class My97Project {
    public static void main(String[] args) throws IOException {
        DataInputStream str = new DataInputStream(System.in);
        String read = str.readLine();
        StringBuilder number = new StringBuilder();

        boolean decimalPointFound = false;

        for (char ch : read.toCharArray()) {
            if (Character.isDigit(ch)) {
                number.append(ch);
            } else if (ch == '.' && !decimalPointFound) {
                number.append(ch);
                decimalPointFound = true;
            } else {
                break;
            }
        }
        if (number.length() > 0) {
            System.out.println(number.toString());
        } else {
            System.out.println("Число не найдено.");
        }
        }
}
