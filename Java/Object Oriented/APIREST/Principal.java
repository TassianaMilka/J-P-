import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class Principal{//Nome da classe

    public static void main(String[] args) throws IOException {
        //Porta 8080
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);


        server.createContext("/dado", new HelloHandler());

        // Inicia o servidor
        server.setExecutor(null);
        server.start();
        System.out.println("\n\n");
        System.out.println("http://localhost:8080/dado");
    }


    static class HelloHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {

            String response = "{\"Marmita_1\":\"Pequna-R$15,00\" " +
                              " \"Marmita_2\":\"Média-R$27,00\""+
                              " \"Marmita_3\":\"Grande-R$36,00\"}";


            exchange.getResponseHeaders().add("Content-Type", "application/json");
            exchange.sendResponseHeaders(200, response.getBytes().length);

            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();

        }
    }
}
