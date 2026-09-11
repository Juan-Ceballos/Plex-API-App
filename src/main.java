import java.net.http.HttpRequest;

public class main {
        HttpRequest getRequest = HttpRequest.newBuilder()
            .uri(null)
            .header("null", "null")
            .build();
}
