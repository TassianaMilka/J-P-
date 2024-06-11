//Programando em Java 15
//packed matrizcal;


//Faça um código destinado a imprimir uma matriz 3x3 que possa só compilar o zero e realizar uma 
//multiplicação pelo 20 com 3 e subtrair pelo 2 para saber o assento encontrado.


import java.util.*;
import java.lang.*;
import java.io.*;


/*impor.java.util.Scanner;*/


public class matrizcal{//Entrada de bloco e  nome da classe

public static void main(String[]args){//Entrada de bloco 

/*Scanner ler=new Scanner(System.in);//Comando utilizado para fazer a leitura dos dados digitados na leitura.*/


//Declaração das variáveis
int numum=3;
int numdois=3;
int [][]num=new int [numum] [numdois];
int i;
int j;
int cal=0;
//Imprimir o resultado da matriz
System.out.println("---------------------Matriz----------------------------");
//Laço de repetição de uma matriz de i  até  3 e j   até 3  
for(i=0;i<3 ;i++){
System.out.println("\n");     
for(j=0; j<3 ;j++){
System.out.println(num[i][j]);

}
}
//Laço de repetição de uma matriz de i  até  3 e j   até 3      
for(i=0;i<3 ;i++){
System.out.println("\n");    
for(j=0; j<3 ;j++){
System.out.println(num[i][j]);

}
}
//Laço de repetição de i até 1
for(i=0;i<1;i++){
//Realização do cálculo
cal=20*3-2;

//Imprimir o resultado do cálculo
System.out.println("-----------------------O assento---------------------");
System.out.println( cal );

} 

}//Saída do bloco

}//Saída do bloco

