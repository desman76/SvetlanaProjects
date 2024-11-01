package lesson12;

import java.io.File;

public class My122Project {
    public static void main(String[] args) throws Exception {
            for (int x =1; x<=1000000; x++) {
            File file = new File("fales/"+x);
            file.createNewFile();
            }
    }
}
