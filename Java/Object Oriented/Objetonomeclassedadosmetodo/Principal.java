//Imprima utilizando método get e set sobre uma música informando nome e nome da música.


import modelo.Dados;


public class Principal {//Nome da classe
    public static void main(String[] args) {


        Dados dado = new Dados();

        System.out.println("\n\n");

        //Dados
        dado.nome = "NewJeans";
        dado.musica = "Super Shy";
      
        //Imprimir os dados
        System.out.println(dado.getNome()+"\n"+dado.getMusica());



    }
}
