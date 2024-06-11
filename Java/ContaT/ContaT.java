package contat;

//Programando em Java(4) or Programming in Java(4).

//Em uma tabela  tem vários numeros de reais e querem saber o resultado  de um por um segue abaixo soma 
//entre de cada linha e  divir pelo numero sem ser em reias:
//382.900+12.940*2;
//140.900+20.750*3;
//345.000+56.780*2;
//123.890+76.000*2;
//100.000+34.000*3;




import java.util.Scanner;

public class ContaT{//Nome classe.Entrada de dado.

   
    public static void main(String[] args) {//Entrada de dado.
        
        
       Scanner ler= new Scanner(System.in);//Comando utilizado para fazer a leitura dos dados digitados na leitura. 
        
        //Declaração das Variáveis.
       
       double reaisP;
       double reaisS;
       double contaP=0;  
       double reiasPS;
       double reaisSS;
       double contaS=0;
       double reiasTP;
       double reaisTS;
       double contaT;
       double reaisQP;
       double reaisQS;
       double contaQ;
       double reaisQUP;
       double reaisQUS;
       double contaQU=0;

   
       //Primeira Linha.
        
        System.out.println("Informe o reais");//Entrada de dado.
        reaisP=ler.nextDouble();//Saída de dado.
        
        
        System.out.println("Informe o reais");//Entrada de dado.
        reaisS=ler.nextDouble();//Saída de dado.
        
          //Conta para calcular 1.
         contaP=reaisP+reaisS*2;
            

         //Segunda Linha.

        System.out.println("Informe o reais");//Entrada de dado.
        reaisSP=ler.nextDouble();//Saída de dado.
        
        System.out.println("Informe o reais");//Entrada de dado.
        reaisSS=ler.nextDouble();//Saída de dado.

          //Conta para calcular 2.
              
        contaS=reaisSP+reaisSS*3;

        //Terceira Linha.

        System.out.println("Informe o reais");//Entrada de dado.
        reaisTP=ler.nextDouble();//Saída de dado.


        System.out.println("Informe o reais");//Entrada de dado.
        reaisTS=ler.nextDouble();//Saída de dado.

        
      //Conta para calcular  3.
       contaS=reaisTP+reaisTS*2;
        

      //Quarta  Linha
         
      System.out.println("Informe o reais ");//Entrada de dado.
      reaisQP=ler.nextDouble();//Saída de dado.


      System.out.println("Informe o reais ");//Entrada de dado.
      reaisQS=ler.nextDouble();Saída de dado ou Leitura de  saída.


        //Conta para  calcular 4;
     
       contaQ=reaisQP+reaisQS*2;

       //Quinta Linha.

      System.out.pritln("Informe o reais");
      reaisQUP=ler.nextDouble();


      System.out.pritln("Informe o reais");
      reaisQUS=ler.nextDouble();
    
     
    //Conta para calcular 5.

     contaQU=reiasQUP+reaisQUS*3;



        //Imprimir os Resultados. 
        
       System.out.println("O resultado final da conta_1 de reais"+"\n"+contaP);
       System.out.println("\n\n");
       System.out.println("O resultado final da conta_2 de reais"+"\n"+contaS);  
       System.out.println("\n\n"); 
       System.out.println("O resultado final da conta_3 de reais"+"\n"+contaT);  
       System.out.println("\n\n"); 
       System.out.println("O resultado final da conta_4 de reais"+"\n"+contaQ);  
       System.out.println("\n\n"); 
       System.out.println("O resultado final da conta_5 de reais"+"\n"+contaQU);

 
    }//Saída de dado.
    
}//Saída de dado.
