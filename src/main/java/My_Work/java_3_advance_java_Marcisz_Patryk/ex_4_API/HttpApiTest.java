package My_Work.java_3_advance_java_Marcisz_Patryk.ex_4_API;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class HttpApiTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newBuilder().build();
        ObjectMapper mapper = new ObjectMapper()
                .configure(
                        DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false
                );
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst do sprawdzenia : ");
        String textValue = scanner.nextLine();
        String accessKey = "access_key=fc6f6a092ed5f97da2276824fecc4140";
        String query = "&query=";
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("http://api.languagelayer.com/detect?" + accessKey + query + textValue))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());


    }
}
