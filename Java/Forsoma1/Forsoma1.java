
package forsoma1;

//Programando em Java(11) or Programming in Java(11).

 //Realizar  dois laços de repetição de 1 até 2 cada um necessita que faz soma  dentro de cada um,
 //depois fazer validação se a soma_1 é menor que a soma _2 depois se a soma_2 é menor que a soma_1 e 
 //para finalizar se o resultados forma iguais não esqucendo de mensagem para classificar conforme o resultado.  



import java.util.Scanner;


public class forsoma1{ //Nome da classe e entrada de bloco.


public static void main(String[] args){


Scanner ler=new Scanner (System.in);//Comando utilizado para fazer a leitura dos dados digitados na leitura.

//Declaração das váriaveis.
int n1;
int n2;
int soma_1=0;
int soma_2=0;
int i;



//Laço de repetição de i até 2 conforme os números informados a seguir.
for(i=0;i<2;i++){
System.out.println("Informe o número"+"\n");//Entrada de dado.
n1=ler.nextInt();//Saída de dado.

//Realização do cálculo da soma_1;
soma_1=n1+n1;



} 


System.out.println("\n\n");

//Laço de repetição de i até 2 conforme os números informados a seguir. 
for(i=0;i<2;i++){

System.out.println("Informe o número");//Entrada de dado.
n2=ler.nextInt();//Saída de dado.

//Realização do cálculo da soma_2;
soma_2=n2+n2;



} 
//Imprimir a mensagem da soma_1.
System.out.println("O resultado da soma_1=="+soma_1);
System.out.println("\n");
//Imprimir a mesagem da soma_2.
System.out.println("O resultado da soma_2=="+soma_2);
System.out.println("\n");

//Validação da soma_1 se é menor que a soma_2.
if(soma_1<soma_2){

    //Imprimir a mensagem do resultado para classificar se o resultado foi válido da soma_1.
    System.out.println("O resultado da soma foi válido sobre a soma_1"+"\n");

//Validação da soma_2 se é maior que a soma_1. 
}if(soma_2<soma_1){

    //Imprimir a mensagem do resultado para classificar se o resultado foi válido da soma_2.
    System.out.println("O resultado da soma foi válido sobre a soma_2"+"\n");
//Validação da soma_1 é igual que a soma_2.
}else if(soma_1==soma_2){

//Imprimir a mensagem do resultado para classificar se o resultado foi válido igual.
System.out.println("O resultado da soma foi válido e igual");

}
}//Saída de bloco.
}//Saída de bloco.