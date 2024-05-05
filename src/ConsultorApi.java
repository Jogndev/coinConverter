import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultorApi {
    public Convertidor buscarMoneda(String denominacionBase) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/7d2ae37900ff9290a15cb61a/latest/" + denominacionBase);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Convertidor.class);
        } catch (Exception e) {
            throw new RuntimeException("La conversión no pudo ser realizada");
        }
    }
}
