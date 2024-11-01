package lesson11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class My115Project {
    public static void main(String[] args) throws IOException {
        int x = 1;
        while (x < 10000) {
            File file = new File("fales/"+x);
            file.createNewFile();
            x=x+1;
        }
    }
}
