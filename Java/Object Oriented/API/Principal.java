//Faça uma simples api e o erro de consulta exception para imprimir.


import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;


public class Principal {//Nome da classe
    public static void main(String[] args) {


                System.out.println("Dados da API  Pokémon\n");

                String endereco ="https://pokeapi.co/api/v2/move/144/";

                try {
                    HttpClient client = HttpClient.newHttpClient();
                    HttpRequest request = HttpRequest.newBuilder()
                            .uri(URI.create(endereco)).build();
                    System.out.println(endereco);

                } catch (ErroConsultaException e) {
                    System.out.println("Erro!");
                    System.out.println(e.getMessage());
                }
            }
        }
