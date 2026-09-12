import java.net.http.HttpRequest;
import java.net.URI;

public class PlexAPIApp {
    public static void main(String[] args) {
        try {
            URI plex_uri = new URI(System.getenv("PLEX_SERVER_URL"));
            HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(plex_uri)
                .header("null", "null")
                .build();
            System.out.println("done");
        } catch(Exception e) {
            System.out.println(System.getenv("PLEX_TV_TOKEN"));
            System.out.println(System.getProperties());
        }
    } 
}
