//Programando em Java(14) or Programming in Java(14).
//packed supermecadovetor;


//Em um supermecado público contém uma sequência de números utilizando  vetor definido pelo  o 
//usuário no momento da compilação necessitando que possa realizar um cálculo conforme 
//o total do produto comprado pelo consumidor na finalidade de dividir pelo número dois,pois
//o resultado vai para classificar os pontos do cartão de forma equivalente no final do mês conter 
//produto de R$15,00 até R$200,00.Nesse caso o comércio contém uma parte também para 
//rebolso dela de até R$10,00 na forma que subtrai e a outra metade destinado para uma doação 
//de organização pública destina as crianças, os  adolescentes e os  jovens  das classe baixa com 
//boas notas para fazerem cursos no desenvolvimento de inovação desde da tecnologia,econômica e 
//ciência.Lembrando é só para quem usar o cartão caso contrário não estará incluído e definido para
//compra acima que R$50.




import java.util.*;
import java.lang.*;
import java.io.*;


import java.util.Scanner;




public class supermercadovetor {// Entrada de bloco e nome da classe

    /**
     * @param args
     */
    public static void main(String[] args) {// Entrada de bloco

        /*Scanner ler = new Scanner(System.in);// Comando utilizado para fazer a leitura dos dados digitados na leitura.*/

        // Declaração das variáveis
        int i;
        int[] n=new int[4];
        int[] num ={8,10,12,14};
        n[0]=8;
        n[1]=10;
        n[2]=12;
        n[3]=14;
        int escolha=2;
        int valor1=17;
        int valor2=150;
        int cal = 0;
        int calfinal = 0;

        // Laço de repetição de i até 4
        for (i = 0; i < 4; i++) {
        
            // Imprimir a mensagem sobre os números dos caixas
            System.out.println("Números informados sobre os caixa do supermecado" + "\n");
            System.out.println("-----------------------------------------------------------------------" + "\n");
            System.out.println(" "+n[i]);
            System.out.println("========================================================================");
            System.out.println("\n+\n");

        }
        
        // Validação de dado igual(==)
        if (escolha == 1) {

           
            // Imprimir a mensagem para classificar o resultado final da compra
            System.out.println("O valor da compra" + "\n");
            System.out.println(valor1);

            System.out.println("\n\n");

            // Imprimir a mensagem para classificar
            System.out.println("Agradeçemos pela sua compra conosco.Volte sempre!");

        }
        // Validação de dado igual(==).
        else if (escolha == 2) {


            // Imprimir a mensagem para classificar o resultado final da compra
            System.out.println("O valor da compra" + "\n");
            System.out.println(valor2);

            // Realizando o cálculo
            cal = valor2 / 2;

            // Imprimir a mensagem para classificar o resultado do cálculo anteriormente
            System.out.println("O resultado do cálculo para adicionar  pontuação no cartão " + "\n");
            System.out.println(cal);

            // Realizando o cálculo
            calfinal = cal - 10;

            // Imprimir a mensagem para classificar o resultado do cálculo anteriormente
            System.out.println("O resultado do cálculo destinado para doação" + "\n");
            System.out.println(calfinal);

            System.out.println("\n");
            // Imprimir a mensagem para classificar
            System.out.println("Agradeçemos pela ajuda nesse projeto e pela compra conosco.Volte sempre!");

        }

    }// Saída de dado

}// Saída de dado
    
