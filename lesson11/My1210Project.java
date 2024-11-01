package lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


public class My1210Project {
    public static void main(String[] args) throws IOException {
           for (int month = 01; month <= 12; month++) {
               String monthString = month <10?"0"+month: String.valueOf(month);
            String page1 = downloadWebPage("https://www.cbr.ru/scripts/XML_dynamic.asp?date_req1=01/"+monthString+"/2014&date_req2=10/"+monthString+"/2021&VAL_NM_RQ=R01235");
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


