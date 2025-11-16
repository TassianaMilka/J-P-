//Realiza uma Orientação a Objeto simples o nome e ano lançamento de um desenho animado.


import java.util.ArrayList;
import java.util.Collections;
import modelo.Listadados;


public class Principal {
    public static void main(String[] args) {
        //Importa a lista array
        ArrayList<Listadados> lista = new ArrayList<>();

        System.out.println("\n\n");

        //Dados da lista
        lista.add(new Listadados("Tassiana"));
        lista.add(new Listadados("Milka"));


        //Em ordem
        Collections.reverseOrder();
        //Loop para imprimir o dado da lista
        for (Listadados listadados : lista) {
            System.out.println(listadados.dados);


        }

 
    }
}
