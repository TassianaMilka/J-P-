package CapitalAP;

//Programando em Java(9) or Programming in Java(9).
//Querem realizar uma conta que informa dois capital  ativo saber o maior valor entre esses e 
//mais dois do outro capital passivo o menor valor,depois  o ativo  e passivo para  realizar uma 
//soma e sendo assim uma multiplicação 0.7 de juro.No final aparecer uma mensagem dos resultados. 

import java.util.Scanner;   


public class CapitalAP{//Nome da classe e entrada de bloco.
  /**
   * @param args
   */
  public static void main(String[]args){//Entrada de bloco.
    
    
    
  Scanner ler= new Scanner(System.in);//Comando utilizado para fazer a leitura dos dados digitados na leitura.
  
   //Declaração das variáveis.

   double  numeroP1;
   double  numeroS1;
   double  numeroP2;
   double  numeroS2;
   double  calculo=0;
   double  valormaior;
   double  valormenor;
   
   

    System.out.println("CAPITAL ATIVO");
    System.out.println("\n"+"\n");

    System.out.println("Informe o valor"+"\n");//Entrada de dado.
    numeroP1=ler.nextDouble();//Saída de dado.
    

    System.out.println("Informe o valor"+"\n");//Entrada de dado.
    numeroS1=ler.nextDouble();//Saída de dado.
    
  

    //Validação do capital ativo sobre o maior valor.

    if(numeroP1>numeroS1){

      //Imprimir uma mensagem sobre o maior valor do capital ativo.
      System.out.println(" O maior valor foi o primeiro do capital ativo"+"\n");
    }else if(numeroS1>numeroP1){
      //Imprimir uma mensagem sobre o maior valor do capital ativo.
      System.out.println(" O maior valor foi o segundo  do capital ativo"+"\n");
    } 


    System.out.println("CAPITAL PASSIVO");
    System.out.println("\n"+"\n");

    System.out.println("Informe o valor"+"\n");//Entrada de dado.
    numeroP2=ler.nextDouble();//Saída de dado.


    System.out.println("Informe o valor"+"\n");//Entrada de dado.
    numeroS2=ler.nextDouble();//Saída de dado.


    //Validação do capital passivo sobre o menor valor.

    if(numeroP2<numeroS2){

      //Imprimir uma mensagem sobre o menor valor do capital passivo.
      System.out.println(" O menor valor foi o primeiro do capital passivo"+"\n");
    }else if(numeroS2<numeroP2){
      //Imprimir uma mensagem sobre o menor valor do capital passivo.
      System.out.println(" O menor valor foi o segundo do capital passivo"+"\n");

    } 
 
   
      System.out.println("Informe o maior valor do capital ativo"+"\n");//Entrada de dado.
      valormaior=ler.nextDouble();//Saída de dado.

      System.out.println("Informe o menor valor do capital passivo"+"\n");//Entrada de dado.
      valormenor=ler.nextDouble();//Saída de dado.



    //Realizar o cálculo da soma e multiplicação do juro.  
    calculo=valormaior+valormenor*0.7;

    

    //Imprimir a mensagem do resultado do cálculo.

    System.out.println("O resultado do cálculo"+"\n"+calculo);

  }//Saída de bloco.

 }//Saída de bloco.
  
