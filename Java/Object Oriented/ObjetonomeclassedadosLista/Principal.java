//Programando em Java(23) or Programming in Java(23).

//Faça uma lista  para dados em ordem  utilizando new.

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
