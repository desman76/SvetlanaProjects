package lesson33;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class My334Project {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Введите адрес ссылки: ");
            String urlString = reader.readLine();

            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder content = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine).append("\n");
                }

                in.close();

                String fileName = "downloaded_page.html";
                FileWriter fileWriter = new FileWriter(fileName);
                fileWriter.write(content.toString());
                fileWriter.close();

                System.out.println("Страница успешно скачана и сохранена в " + fileName);
            } else {
                System.out.println("Страница не найдена. Код ответа: " + responseCode);
            }
            connection.disconnect();
        } catch (IOException e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }
}
