package Valorp1;

//Programando em Java(7) or Programming in Java(7).
//Contém 10 até 40 reais  de valores e pediram para solicitar,depois realizar um cálculo de uma soma 
//valor+100 e descrever uma mensagem no final o resultado.

import java.util.Scanner;

public class Valorp1 {// Nome da Classe e entrada de bloco.

/**
 * @param args
 */
public static void main(String[] args) {//Entrada de bloco.

  
    
 Scanner ler = new Scanner(System.in);//Comando utilizado para fazer a leitura dos dados digitados na leitura.

     
    
    //Declaração das Variáveis. 

    double valor;
    double cal=0;

 

    System.out.println("Informe o valor de 10 até 40 reais");//Entrada de dado.
    valor=ler.nextDouble();//Saída de dado.

    //Validação dos valores digitados de  10,20,30 ou 40 utilzando o OU(||).
    if(valor==10||valor==20){
      //Imprimir uma mensagem sobre 10 ou 20 reais,caso informa esses valores.
      System.out.println("Já armazenado o valor informado 10  ou 20 reais"+"\n");
      }else if(valor==30||valor==40){
        //Imprimir uma mensagem sobre 30 ou 40 reais,caso informa esses valores.
      System.out.println("Já armazenado o valor informado 30 ou 40 reais"+"\n");
      }

       //Cálculo de soma do valor+100.
       cal=valor+100;

        
       //Imprimir o resultado do cálculo da soma.

       System.out.println("O valor final"+"\n"+cal);





  


   }//Saída de bloco.
}//Saída de bloco.
