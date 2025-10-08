package codigo;

//Programando em Java(6) or Programming in Java(6).
//Em uma loja necessitam realizar e saber se o código 39060 e o 18050 esta armazenado.

import java.util.Scanner;

public class Codigo {// Nome da Classe e entrada de bloco.

/**
 * @param args
 */
public static void main(String[] args) {//Entrada de bloco(Corrigindo o que falei no vídeo).

  
    
 Scanner ler = new Scanner(System.in);//Comando utilizado para fazer a leitura dos dados digitados na leitura.

    
    
   //Declaração das variáveis.
 
    int numeros1;
    int numeros2;

    
    System.out.println("Informa o código"+"\n");//Entrada de dado.
    numeros1=ler.nextInt();//Saída de dado.
     
      //Validação do que foi informado se o código1 está armazenado.
      if(numeros1==39060){

       System.out.println("O código armazenado"+"\n");


      }else{

          System.out.println("O código não armazenado"+"\n");

      }



    System.out.println("Infome o código \n");//Entrada de dado.
    numeros2=ler.nextInt();//Saída de dado.



    //Validação do que foi informado se o código2 está armazenado.
    if(numeros2==18050){


      System.out.println("O código armazenado");
    }else{


      System.out.println("O código não armazenado");
    }



  }//Saída de bloco.

}//Saída de dado.
