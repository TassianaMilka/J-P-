//Programando em Java(20) or Programming in Java(20).

//Realiza uma classe com o nome  dorama com nomes e anos de lançamentos
//para imprimir seus dados.


public class Principal {//Nome da classe
    public static void main(String[] args) {

        //Dados sobre nomes e ano de lançamento pelo nome da segunda classe Dorama
        Dorama dorama = new Dorama();
        dorama.nome_Primeiro = "Coffee Prince";
        dorama.ano_Primeiro = 2007;
        dorama.nome_Segundo=" Goblin";
        dorama.ano_Segundo= 2016;

        //Imprimir os dados descrito e do void na classe Dorama
        dorama.dados_Primeiro();
        dorama.dados_Segundo();


    }
}
