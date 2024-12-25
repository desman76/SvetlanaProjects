package lesson46;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class My461Project {
    public static void main(String[] args) {
      String text = getText();
        List <String> words = Arrays.asList(text.split(" "));
        HashSet<String> set = new HashSet<>(words);
        System.out.println(words.size());

    }
    public static String getText() {
        String text = "";
        try (FileReader fr = new FileReader("Файл46")) {
            int ch;
            while ((ch = fr.read()) !=-1){
                text += (char) ch;
            }
            text = text.replaceAll ("[-.,;:()\\[\\]]|]", "");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

        return text;
    }
}
