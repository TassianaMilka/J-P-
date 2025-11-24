//Programando em Java(26) or Programming in Java(26).

//Cria um json com os dado país Brasil e cidade Campinas para imprimir o resultado.


import com.google.gson.Gson;


public class Principal {//Nome da classe
    public static void main(String[] args) {


        String jsondado = "{\"pais\":\"Brasil\",\"cidade\":\"Campinas\" }";
        Gson gsonD = new Gson();
        Dadoglap dado = gsonD.fromJson(jsondado, Dadoglap.class);
        System.out.println(dado);

    }
}
