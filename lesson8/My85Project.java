package lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class My85Project {
    public static void main(String[] args) throws IOException {
        String page = downoloadWebPAge("https://api.breakingbadquotes.xyz/v1/quotes");
        int quoteStart = page.indexOf("quote");
        int quoteEnd = page.lastIndexOf("author");
        String quote = page.substring(quoteStart+8, quoteEnd-3);
        if (quote.length() > 50) {
            System.out.println(quote.substring(0, 50)+"...");
        } else {
            System.out.println(quote);
        }
            }
    private static String downoloadWebPAge(String url) throws IOException {
        StringBuilder result = new StringBuilder();
        String line;
        URLConnection urlConnection = new URL(url).openConnection();
        try (InputStream is = urlConnection.getInputStream();
             BufferedReader br = new BufferedReader(new InputStreamReader(is))){
            while ((line = br.readLine()) != null) {
                result.append(line);
            }
        }
        return result.toString();
    }
}
