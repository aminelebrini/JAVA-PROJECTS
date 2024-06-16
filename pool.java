import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class pool {

    private static final String URL = "https://admission.1337.ma/en/candidature/piscine"; // Replace with the actual URL
    private static final String ANNOUNCEMENT_KEYWORD = "pool announcement"; // Replace with the actual keyword

    // ANSI color codes
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        try {
            boolean isPoolAnnounced = false;

            while (!isPoolAnnounced) {
                // Fetch the web page content
                String pageContent = fetchPageContent(URL);

                // Check for the pool announcement
                isPoolAnnounced = checkForPoolAnnouncement(pageContent);

                if (!isPoolAnnounced) {
                    System.out.println(ANSI_RED + "The pool has not been announced. Checking again in 5 seconds..."
                            + ANSI_RED);
                    Thread.sleep(5000); // Sleep for 5 seconds before checking again
                }
            }

            System.out.println(ANSI_GREEN + "The pool has been announced!" + ANSI_RESET);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            System.out.println(ANSI_RED + "Error occurred: " + e.getMessage() + ANSI_RESET);
        }
    }

    private static String fetchPageContent(String url) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    private static boolean checkForPoolAnnouncement(String pageContent) {
        // Check if the page content contains a specific string indicating the pool
        // announcement
        return pageContent.contains(ANNOUNCEMENT_KEYWORD);
    }
}
