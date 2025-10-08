//Programando em Java(18) or Programming in Java(18).
//package charvalor;


//Faça um código utilizando char para imprimir o nome do produto vidro e saber se está com desconto ou não
//na compilação.
    
import java.util.*;
import java.lang.*;
import java.io.*;

/*import java.util.Scanner;*/


public class charvalor{//Nome da Classe e entrada de bloco.
  
public static void main(String[] args) {
        
 //Scanner ler=new Scanner(System.in);
    
//Declaração das Variavéis 

double valor=500;
char[] produto={'V','i','d','r','o'};   

//Imprimir a mensagem  com o nome do produto digitado anteriormente.
System.out.println(" ---------------------------------O nome do produto selecionado----------------------");
System.out.println("\n");
System.out.println(produto);
System.out.println("\n");
    

//Validação de dado conforme o que foi declarado nas váriaveis.
if(valor>500){
//Imprimir a mensagem do valor
System.out.println("O valor de R$"+valor);
System.out.println("---------------------------------O produto está com desconto----------------------");

}else{
//Imprimir a mensagem  do valor 
System.out.println("O valor de R$"+valor);
System.out.println("---------------------------------O produto não está com desconto----------------------");

}
}//Saída de bloco
}//Saída de bloco
