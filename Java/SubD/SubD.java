

package subd;

 //Programando em Java(3) or Programming in Java(3).
//Crie um programa com os mesmo número do exercício anterior,porém agora vai ser 53-3 e divide por um 
//número digitado que possa aparecer as mensagens dos resultados.

import java.util.Scanner;

public class SubD {//Nome da classe e entrada de bloco.

   
    public static void main(String[] args) {
        
        
     Scanner ler= new Scanner(System.in);//Comando utilizado para fazer a leitura dos dados digitados na leitura.
     
     
     //Declaração das variaveis
     int numeroD;
     int Sub=0;//Zero para não ocorrer erro.
     int Div=0;//Zero para não ocorrer erro.
     
        Sub=53-3;//Conta.
     
        System.out.println("Informe o numero da divisao");//Entrada de Leitura.
        numeroD=ler.nextInt();                           //Entrada de Saída.
        
        Div=Sub/numeroD;//Conta.
        
        //Imprimir os Resultados Finais.
        
         System.out.println("A Matematica Realizada da Subtracao");
         System.out.println("O resultado da Subtracao"+"\n"+Sub);
         System.out.println("\n");
         System.out.println("A Matematica Realizada da Divisao");
         System.out.println("O resultado da Divisao"+"\n"+Div);
         
         
         
        
    }//Saída de bloco.
 
    
}//Saída de bloco.


    

