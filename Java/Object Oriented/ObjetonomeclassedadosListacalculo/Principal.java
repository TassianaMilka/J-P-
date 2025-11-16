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
        lista.add(new Listadados("do resultado do cálculo"));
        lista.add(new Listadados("Demonstração"));


        //No final para o começo
        Collections.sort(lista);
        //Loop para imprimir o dado da lista
        for (Listadados listadados : lista) {
            System.out.println(listadados.dados);


        }

         
         System.out.println("\n\nCálculo\n");
         //Realização do cálculo
         double calculo= 123+67-9/12*2;
         //Imprimir o cálculo
         System.out.println(calculo);
 
    }
}
