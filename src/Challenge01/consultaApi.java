package Challenge01;

import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class consultaApi {

    public Moneda buscarMoneda(String monedaBase, String monedaAConvertir) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/468e1d65255897b2b434b490/pair/" + monedaBase + "/" + monedaAConvertir);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("no esncontre la moneda");
        }
    }
}