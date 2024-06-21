//Programando em Java(17) or Programming in Java(17).
//packed caldowhile;

//Realiza um código utilizando Do while que informa os números de uma pontência que o resultado é 16,caso não digita corretamente conter uma mensagem para identificar
//e a mesma forma como encontrar o valor da raiz quadrada de 225 caso obtem uma resposta errada conter uma outra mensagem de todas vezes que estiver certo contar o 
//ponto no final e uma frase para classificar.

import java.util.*;
import java.lang.*;
import java.io.*;

/*import.java.util.Scanner;*/


public class caldowhile{//Entrada de bloco e nome da classe

public static void main(String[] args){//Entrada de bloco

Scanner ler=new Scanner(System.in);//Comando utilizado para fazer a leitura dos dados digitados na leitura.
    

//Declaração das variáveis já realizando o cálculo.
int informap=222;
int informas=1515;
int pot=2*2*2;
int raizquadrada=15*15;
int pontop=1;
int pontos=2;
int somaponto=0;
int num=1;

do{
//Imprimir a mensagem para classificar.
System.out.println("Os números que obtém o resultado 16 da pontência"+"\n");

//Validação de dado conforme é digitado anteriormentecaso seja igual(=).
if(informap==222){
//Imprimir a mensagem para classficar a mensagem conforme o que foi digitado anteriormente.
System.out.println("Esta correto o 2*2*2 são utilizado na potência para obter o resultado 16"+"\n");

//Imprimir amensagem para classificar o resultado da potência.
System.out.println("O resultado da potência="+pot);
pontop=1;
}
else{

//Imprimir a mensagem para classificar conforme anteriormente foi digitado.
System.out.println("Esta incorreta não são os números utilizado"+"\n");
System.out.println("São utilizado para realizar a potência o 2*2*2 para obter o resultado 16"+"\n");   


} 
//Imprimir a mensagem para classificar.
System.out.println("Os números que obtém o resultado 16 da raiz quadrada"+"\n");

//Validação de dado conforme é digitado anteriormentecaso seja igual(=).
if(informas==1515){

//Imprimir a mensagem para classficar a mensagem conforme o que foi digitado anteriormente.
System.out.println("Esta correto o 225 é uma raiz quadrada  que utiliza o 15*15  para obter o resultado"+"\n");
pontos=1;


}
else{

//Imprimir a mensagem para classificar conforme anteriormente foi digitado.
System.out.println("Esta incorreta não são os números utilizado"+"\n");
System.out.println("São utilizado para saber se 225 é uma raiz quadrada"+"\n");

}

//Realiza uma soma dos pontos que foi adquiridos.
somaponto=pontop+pontos;
//Imprimir a mensagem sobre a quantidade de pontos.
System.out.println("A quantidade de pontos adquiridos="+somaponto);
    //Inclementação.
    num++;

}while(num<1);



}//Saída de bloco


}//Saída de bloco
