//Programando em Java 16
//packed frasewhile;

import java.util.*;
import java.lang.*;
import java.io.*;


/*impor.java.util.Scanner;*/


//Faça um código utilizando while  para visualizar os dois números que mais representa a computação
//e uma validação de 1-não e 2-sim para imprimir mensagem sem a string.


public class frasewhile{//Entrada de bloco e  nome da classe

public static void main(String[]args){//Entrada de bloco 

Scanner ler=new Scanner(System.in);//Comando utilizado para fazer a leitura dos dados digitados na leitura.

//Declaração das variavéis.
double informa=2.0;
int i=0;

//Imprimir a mensagem para classificar
System.out.println("Os números que mais representa a computação!");
//Looop(Laço de repetição);    
while (i < 2) {
 
System.out.println(i);
//Inclementação 
 i++;
}

//Validação de dado de igual(=).
if(informa==1.0){

//Imprimir a mensagem para classficar conforme foi digitado anteriormente.
System.out.println("Tudo bem.Não contém problema!"+"\n");

}else if(informa==2.0){

//Imprimir as mensagens para classificar sobre conforme foi digitado anteriormente.
System.out.println("Tudo começou em uma temporada de uma trajetória que faz refletir."+"\n");
System.out.println("Essa mensagem é do número -1"+"\n");

}

//Imprimir a mensagem final para classificar.
System.out.println("Finalização da sequência.Agradecimento pela atenção!");

}//Saída de bloco

}//Saída de bloco




