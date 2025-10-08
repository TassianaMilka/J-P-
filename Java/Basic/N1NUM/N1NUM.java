//package N1Num;

//Programando em Java(8) or Programming in Java(8).
//Solicita na entrada de dado para  que informa um número tipo inteiro sendo assim uma validação do número digitado menor que 9 
//e número digitado diferente igual a 5 caso contrário aparecer uma mensagem o número não foi armazenado,depois realizar um 
//cálculo do número digitado+20 aparecendo uma mensagem o cálculo da finalizado e uma outra mensagem fim da execução.  



import java.util.Scanner;

public class N1NUM {//Nome da Classe e entrada de bloco.

    /**
     * @param args
     */
    public static void main(String[]args){//Entrada de bloco.
    
        Scanner ler= new Scanner(System.in);//Comando utilizado para fazer a leitura dos dados digitados na leitura.
    
    //Declaração das variáveis.
   
     int n1;
     int cal=0;  
    

     System.out.println("Informe o número");//Entrada de dado.
     n1=ler.nextInt();                       //Saída de dado.


     //Validação do  n1 menor que 9 e(&&) n1 diferente(negação) igual a 5.

     if(( n1<9 && n1!=5)){
        //Imprimir a mensagem já armazenado.
        System.out.println("Já armazenado"+"\n");
     }else {
          //Imprimir a mensagem não armazenado.
        System.out.println("Não armazenado"+"\n");
     } 
     //Realização do cálculo.
     cal=n1+20;

     //Imprimir o resultado do cálculo da soma.
     System.out.println("O cálculo da finalizado----------"+cal);
     System.out.println ("\n");
     //Imprimir a mensagem final.
     System.out.println("Fim da execução");
      


     }//Bloco de saída.
}//Bloco de saída.
