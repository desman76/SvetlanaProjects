package lesson42;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

interface NewsFetcher {
    default void fetchNews(String category) {
        String apiUrl = "https://inshortsapi.vercel.app/news?category=" + category;
        try {
            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            System.out.println("Новости по категории " + category + ": " + response.toString());
        } catch (Exception e) {
            System.out.println("Ошибка при получении новостей: " + e.getMessage());
        }
    }
}
