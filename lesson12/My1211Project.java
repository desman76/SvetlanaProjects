package lesson12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class My1211Project {
    public static void main(String[] args) throws IOException {
        for (int year = 1994; year <= 2024; year++) {
            String page1 = downloadWebPage("https://www.cbr.ru/scripts/XML_dynamic.asp?date_req1=01/02/"+year+"&date_req2=03/02/"+year+"&VAL_NM_RQ=R01235");
            int startIndex1 = page1.lastIndexOf("<Value>");
            int endIndex1 = page1.lastIndexOf("</Value>");
            String courseStr1 = page1.substring(startIndex1 + 7, endIndex1);
            System.out.println(courseStr1);
        }
    }

    private static String downloadWebPage(String url) throws IOException {
        StringBuilder result = new StringBuilder();
        String line;
        URLConnection urlConnection = new URL(url).openConnection();
        try (InputStream is = urlConnection.getInputStream();
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            while ((line = br.readLine()) != null) {
                result.append(line);
            }
        }
        return result.toString();
    }
}

