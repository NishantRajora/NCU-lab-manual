import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class URLChecker {

    public static void main(String[] args) {
        String baseUrl = "https://uatapi.ncuindia.edu/api/myapp/Examination/GetDGS";
        String[] userIds = {
            "-w_1gMo_n2frAhTkKW8dtd74XB9YMLDW8Yl_CWF53yE=",
            "another_user_id_1",
            "another_user_id_2",
            // Add more user IDs as needed
        };
        int repetitions = 100;

        Map<String, Integer> validUrls = checkUrlValidity(baseUrl, userIds, repetitions);

        // Print all valid URLs and their counts
        System.out.println("Valid URLs and their counts:");
        for (Map.Entry<String, Integer> entry : validUrls.entrySet()) {
            if (entry.getValue() > 0) {
                System.out.println(entry.getKey() + " - Valid Count: " + entry.getValue());
            }
        }
    }

    public static Map<String, Integer> checkUrlValidity(String baseUrl, String[] userIds, int repetitions) {
        Map<String, Integer> validUrls = new HashMap<>();

        for (String userId : userIds) {
            String url = baseUrl + "?userId=" + userId + "&session=19";
            int validCount = 0;

            for (int i = 0; i < repetitions; i++) {
                try {
                    HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
                    connection.setRequestMethod("GET");
                    connection.connect();

                    int responseCode = connection.getResponseCode();
                    if (responseCode == 200) {
                        validCount++;
                    } else {
                        System.out.println("Invalid URL: " + url + " - Status Code: " + responseCode);
                    }

                    connection.disconnect();
                } catch (IOException e) {
                    System.out.println("Error checking URL: " + url + " - " + e.getMessage());
                }

                // Optional: Sleep for a short duration to avoid overwhelming the server
                try {
                    Thread.sleep(100); // Sleep for 100 milliseconds
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

            // Store the valid count for this user ID
            validUrls.put(url, validCount);
        }

        return validUrls;
    }
}