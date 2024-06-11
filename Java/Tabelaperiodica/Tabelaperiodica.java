package tabelaperiodica;

//Programando em Java(12) or Programming in Java(12).

//Uma aluna necessita realizar código utilizando alguns itens da Química sobre a Tabela Períodica que vai precisar 
//utilizar o for de i até 1 e não esqucendo da validação de dado deixando para o usuário a finalidade de escolher se deseja 
//saber ou não dividindo em grupo de A até I entre também deixar na escolha com a principal função de esclarecer as informações que a 
// seguir será descrevida que é:

//Grupo-A
//1-Hidrogênio
//2-Frânico 

//Hidrogênio contém Gase que corresponde a uma quantidade de massa atômica 1.00794 com reconhecimento pela sua sigla-H
//Frânico contém Sólido que corresponde a uma quantidade de massa atômica de 223 com reconheconhecimento pela sua sigla-Fr

//Grupo-B
//1-Litio
//2-Potássio

//Litio contém sólido  que corresponde a uma quantidade de massa atômica de 6.941 com reconhecimento pela sua sigla-Li
//Potássio contém Sólido que corresponde a uma quantidade de massa atômica de 39.0983 com reconhecimento pela sua sigla-K

//Grupo-C
//1-Magnésio
//2-Cálcio

//Magnésio contém Sólido  que corresponde a uma quantidade de massa atômica 24.3050 com reconhecimento pela sua sigla-Mg  
//Cálcio contém Sólido que corresponde a uma quantidade de massa atômica de 40.078 com reconhecimento pela sua sigla-Ca

//Gurpo-D
//1-Mercúrio
//2-Brosmo

//Mercúrio contém Líquido que corresponde a uma quantidade de massa atômica 200.59 com reconhecimento pela sua sigla-Hg  
//Brosmo contém Líquido  que corresponde a uma quantidade de massa atômica de 79.904 com reconhecimento pela sua sigla-Br

//Grupo-E
//1-Urunhexium
//2-Plutônio

//Urunhexium contém Sintético que corresponde a uma quantidade de massa atômica 292 com reconhecimento pela sua sigla-Uuh
//Plutônio contém Sintético que corresponde a uma quantidade de massa atômica de 244 com reconhecimento pela sua sigla-Pu

//Grupo-F
//1-Alumínio
//2-Vanâdio

//Alumínio contém Sólido que corresponde a uma quantidade de massa atômica 26.981538 com reconhecimento pela sua sigla-AI
//Vanâdio contém Sólido que corresponde a uma quantidade de massa atômica de 50.9415 e que é reconhecida pela sua sigla-V


//Grupo-G
//1-Carbono
//2-Fósforo

 //Carbono contém Sólido que corresponde a uma quantidade de massa atômica de 12.0107 e que é reconhecido pela sua sigla   
//Fósforo contém Sólido que corresponde a uma quantidade de massa atômica de 30.9737331 e que é reconhecida pela sua sigla-P   
    

//Grupo-H
//1-Fluor
//2-Astato

//Fluor contém Gase que corresponde a uma quantidade de massa atômica 18.9984032 e que é reconhecido pela sua sigla-F
//Astato contém Sólido que corresponde a uma quantidade de massa atômica de 210 e que é reconhecida pela sua sigla-A

//Grupo-I
//1-Európio
//2-Urânio

//Európio contém Sólido que corresponde a uma quantidade de massa atômica 151.964 e que é reconhecido pela sua sigla-Eu
//Urânio contém Sólido que corresponde a uma quantidade de massa atômica de 238.02891 e que é reconhecida pela sua sigla-U

//e no final aparecer uma mensagem para classificar dessa maneira "Já finalizado os grupos".


import java.util.Scanner;


public class tabelaperiodica{ //Nome da classe e entrada de bloco.


    /**
     * @param args
     */
    public static void main(String[] args){//Entrada de bloco.
    
    
    Scanner ler=new Scanner (System.in);//Comando utilizado para fazer a leitura dos dados digitados na leitura.
    

//Declaração das váriaveis.
int grupoa;
int grupob;
int grupoc;
int grupod;
int grupoe;
int grupof;
int grupog;
int grupoh;
int grupoi;
int num1;
int num2;
int num3;
int num4;
int num5;
int num6;
int num7;
int num8;
int num9;
int i;



System.out.println("Selecione a seguir conforme o componente químico"+"\n");
System.out.println("Grupo-A"+"\n");
System.out.println("1-Hidrogênio"+"\n");
System.out.println("2-Frânico"+"\n");
System.out.println("\n");

System.out.println("Grupo-B"+"\n");
System.out.println("1-Litio"+"\n");
System.out.println("2-Potássio"+"\n");
System.out.println("\n");

System.out.println("Grupo-C"+"\n");
System.out.println("1-Magnésio"+"\n");
System.out.println("2-Cálcio"+"\n");
System.out.println("\n");

System.out.println("Gurpo-D"+"\n");
System.out.println("1-Mercúrio"+"\n");
System.out.println("2-Brosmo"+"\n");
System.out.println("\n");

System.out.println("Grupo-E"+"\n");
System.out.println("1-Urunhexium"+"\n");
System.out.println("2-Plutônio"+"\n");
System.out.println("\n");

System.out.println("Grupo-F"+"\n");
System.out.println("1-Alumínio"+"\n");
System.out.println("2-Vanâdio"+"\n");
System.out.println("\n");


System.out.println("Grupo-G"+"\n");
System.out.println("1-Carbono"+"\n");
System.out.println("2-Fósforo"+"\n");
System.out.println("\n");


System.out.println("Grupo-H"+"\n");
System.out.println("1-Fluor"+"\n");
System.out.println("2-Astato"+"\n");
System.out.println("\n");

System.out.println("Grupo-I"+"\n");
System.out.println("1-Európio"+"\n");
System.out.println("2-Urânio"+"\n");
System.out.println("\n");



System.out.println("Deseja saber do Grupo-A para sim-[1] ou não-[2]"+"\n");//Entrada de dado.
grupoa=ler.nextInt();//Saída de dado.
 //Validação conforme o número selecionado anteiror que é ígual.
if(grupoa==1){
    //Imprimir a mensagem para classificação conforme foi anteriomente digitado.
    System.out.println("A seguir informe para saber lembrando que 1-Hidrogênio e o 2-Frânico"+"\n");



//Laço de repetição de i até 1 conforme o número informado a seguir.
for(i=0;i<1;i++){

System.out.println("Informe o número para classificação do Grupo-A"+"\n");//Entrada de dado.
num1=ler.nextInt();//Saída de dado.

//Validação conforme o número selecionado anteiror que é ígual.
if(num1==1){
//Imprimir a mensagem para classificação conforme foi anteriomente digitado.
System.out.println("Hidrogênio contém Gase que corresponde a uma quantidade de massa atômica 1.00794 com reconhecimento pela sua sigla-H"+"\n");

}else if(num1==2){
//Imprimir a mensagem para classificação conforme foi anteriomente digitado.
    System.out.println("Frânico contém Sólido que corresponde a uma quantidade de massa atômica de 223 com reconheconhecimento pela sua sigla-Fr"+"\n");

} 
     }
}
else if(grupoa==2){

    //Imprimir a mensagem para classificação conforme foi anteriomente digitado.
    System.out.println("Não quer saber sobre o Grupo-A a seguir terá outros grupos na sequência"+"\n");
 } 


System.out.println("Deseja saber do Grupo-B para sim-[1] ou não-[2]");//Entrada de dado.
grupob=ler.nextInt();//Saída de dado.

//Validação conforme o número selecionado anteiror que é ígual.
if(grupob==1){
    //Imprimir a mensagem para classificação conforme foi anteriomente digitado.
    System.out.println("A seguir informe para saber lembrando que 1-Litio e o 2-Potássio"+"\n");

    //Laço de repetição de i até 1 conforme o número informado a seguir.
    for(i=0;i<1;i++){
    
    System.out.println("Informe o número para classificação do Grupo-B"+"\n");//Entrada de dado.
    num2=ler.nextInt();//Saída de dado.
    
    //Validação conforme o número seleciona anteiror que é ígual.
    if(num2==1){
      //Imprimir a mensagem para classificação conforme foi anteriomente digitado.

    System.out.println("Litio contém sólido  que corresponde a uma quantidade de massa atômica de 6.941 com reconhecimento pela sua sigla-Li"+"\n");

         //Imprimir a mensagem para classificação conforme foi anteriomente digitado.
    }else if(num2==2){
    System.out.println("Potássio contém Sólido que corresponde a uma quantidade de massa atômica de 39.0983 com reconhecimento pela sua sigla-K"+"\n");
         }
    }
}

else if(grupob==2){    
    
    
    //Imprimir a mensagem para classificação conforme foi anteriomente digitado.
    System.out.println(" Não quer saber sobre o Grupo-B a seguir terá outros grupos na sequência"+"\n");                                     
 } 


System.out.println("Deseja saber do Grupo-C para sim-[1] ou não-[2]"+"\n");//Entrada de dado.
grupoc=ler.nextInt();//Saída de dado.
 //Validação conforme o número selecionado anteiror que é ígual.
if(grupoc==1){
    //Imprimir a mensagem para classificação conforme foi anteriomente digitado.
    System.out.println("A seguir informe para saber lembrando que 1-Magnésio e o 2-Cálcio"+"\n");



//Laço de repetição de i até 1 conforme o número informado a seguir.
for(i=0;i<1;i++){

System.out.println("Informe o número para classificação do Grupo-C"+"\n");//Entrada de dado.
num3=ler.nextInt();//Saída de dado.

//Validação conforme o número selecionado anteiror que é ígual.
if(num3==1){
//Imprimir a mensagem para classificação conforme foi anteriomente digitado.
System.out.println("Magnésio contém Sólido  que corresponde a uma quantidade de massa atômica 24.3050 com reconhecimento pela sua sigla-Mg"+"\n");

}else if(num3==2){
//Imprimir a mensagem para classificação conforme foi anteriomente digitado.
    System.out.println("Cálcio contém Sólido que corresponde a uma quantidade de massa atômica de 40.078 com reconhecimento pela sua sigla-Ca"+"\n");
} 
}
     }else if(grupoc==2){

    //Imprimir a mensagem para classificação conforme foi anteriomente digitado.
    System.out.println("Não quer saber sobre o Grupo-C a seguir terá outros grupos na sequência"+"\n");
 } 


System.out.println("Deseja saber do Grupo-D para sim-[1] ou não-[2]"+"\n");//Entrada de dado.
grupod=ler.nextInt();//Saída de dado.
 //Validação conforme o número selecionado anteiror que é ígual.
if(grupod==1){
    //Imprimir a mensagem para classificação conforme foi anteriomente digitado.
    System.out.println("A seguir informe para saber lembrando que 1-Mercúrio e o 2-Brosmo"+"\n");

//Laço de repetição de i até 1 conforme o número informado a seguir.
for(i=0;i<1;i++){

    System.out.println("Informe o número para classificação do Grupo-D"+"\n");//Entrada de dado.
    num4=ler.nextInt();//Saída de dado.
    
    //Validação conforme o número selecionado anteiror que é ígual.
    if(num4==1){
    //Imprimir a mensagem para classificação conforme foi anteriomente digitado.
    System.out.println("Mercúrio contém Líquido que corresponde a uma quantidade de massa atômica 200.59 com reconhecimento pela sua sigla-Hg"+"\n");
    
    }else if(num4==2){
    //Imprimir a mensagem para classificação conforme foi anteriomente digitado.
        System.out.println("Brosmo contém Líquido  que corresponde a uma quantidade de massa atômica de 79.904 com reconhecimento pela sua sigla-Br"+"\n");
    
    }
}
    }else if(grupod==2){
    
        //Imprimir a mensagem para classificação conforme foi anteriomente digitado.
        System.out.println("Não quer saber sobre o Grupo-D a seguir terá outros grupos na sequência"+"\n");
    } 


     System.out.println("Deseja saber do Grupo-E para sim-[1] ou não-[2]"+"\n");//Entrada de dado.
     grupoe=ler.nextInt();//Saída de dado.
     //Validação conforme o número selecionado anteiror que é ígual.
if(grupoe==1){
    //Imprimir a mensagem para classificação conforme foi anteriomente digitado.
    System.out.println("A seguir informe para saber lembrando que 1-Urunhexium e o 2-Plutônio"+"\n");

//Laço de repetição de i até 1 conforme o número informado a seguir.
for(i=0;i<1;i++){

    System.out.println("Informe o número para classificação do Grupo-E"+"\n");//Entrada de dado.
    num5=ler.nextInt();//Saída de dado.
    
    //Validação conforme o número selecionado anteiror que é ígual.
    if(num5==1){
    //Imprimir a mensagem para classificação conforme foi anteriomente digitado.
    System.out.println("Urunhexium contém Sintético que corresponde a uma quantidade de massa atômica 292 com reconhecimento pela sua sigla-Uuh"+"\n");
    
    }else if(num5==2){
    //Imprimir a mensagem para classificação conforme foi anteriomente digitado.
        System.out.println("Plutônio contém Sintético que corresponde a uma quantidade de massa atômica de 244 com reconhecimento pela sua sigla-Pu"+"\n");
    }
}
        
    }else if(grupoe==2){
    
        //Imprimir a mensagem para classificação conforme foi anteriomente digitado.
        System.out.println("Não quer saber sobre o Grupo-E a seguir terá outros grupos na sequência"+"\n");
    } 

    System.out.println("Deseja saber do Grupo-F para sim-[1] ou não-[2]"+"\n");//Entrada de dado.
    grupof=ler.nextInt();//Saída de dado.
    //Validação conforme o número selecionado anteiror que é ígual.
if(grupof==1){
   //Imprimir a mensagem para classificação conforme foi anteriomente digitado.
   System.out.println("A seguir informe para saber lembrando que 1-Alumínio e o 2-Vanâdio"+"\n");

//Laço de repetição de i até 1 conforme o número informado a seguir.
for(i=0;i<1;i++){

   System.out.println("Informe o número para classificação do Grupo-F"+"\n");//Entrada de dado.
   num6=ler.nextInt();//Saída de dado.
   
   //Validação conforme o número selecionado anteiror que é ígual.
   if(num6==1){
   //Imprimir a mensagem para classificação conforme foi anteriomente digitado.
   System.out.println("Alumínio contém Sólido que corresponde a uma quantidade de massa atômica 26.981538 com reconhecimento pela sua sigla-AI"+"\n");
   
   }else if(num6==2){
   //Imprimir a mensagem para classificação conforme foi anteriomente digitado.
       System.out.println("Vanâdio contém Sólido que corresponde a uma quantidade de massa atômica de 50.9415 e que é reconhecida pela sua sigla-V"+"\n");
   
    }
}
   } else if(grupof==2){
   
       //Imprimir a mensagem para classificação conforme foi anteriomente digitado.
       System.out.println("Não quer saber sobre o Grupo-F a seguir terá outros grupos na sequência"+"\n");
   } 


       
    System.out.println("Deseja saber do Grupo-G para sim-[1] ou não-[2]"+"\n");//Entrada de dado.
    grupog=ler.nextInt();//Saída de dado.
     //Validação conforme o número selecionado anteiror que é ígual.
if(grupog==1){
    //Imprimir a mensagem para classificação conforme foi anteriomente digitado.
    System.out.println("A seguir informe para saber lembrando que 1-Carbono e o 2-Fósforo"+"\n");

//Laço de repetição de i até 1 conforme o número informado a seguir.
for(i=0;i<1;i++){

    System.out.println("Informe o número para classificação do Grupo-G"+"\n");//Entrada de dado.
    num7=ler.nextInt();//Saída de dado.
    
    //Validação conforme o número selecionado anteiror que é ígual.
    if(num7==1){
    //Imprimir a mensagem para classificação conforme foi anteriomente digitado.
    System.out.println("Carbono contém Sólido que corresponde a uma quantidade de massa atômica de 12.0107 e que é reconhecido pela sua sigla-C"+"\n");
    
    }else if(num7==2){
    //Imprimir a mensagem para classificação conforme foi anteriomente digitado.
        System.out.println("Fósforo contém Sólido que corresponde a uma quantidade de massa atômica de 30.9737331 e que é reconhecida pela sua sigla-P"+"\n");
    }
      
    }
 } else if(grupog==2){
    
        //Imprimir a mensagem para classificação conforme foi anteriomente digitado.
        System.out.println("Não quer saber sobre o Grupo-G a seguir terá outros grupos na sequência"+"\n");
    } 
   
    System.out.println("Deseja saber do Grupo-H para sim-[1] ou não-[2]"+"\n");//Entrada de dado.
    grupoh=ler.nextInt();//Saída de dado.
    //Validação conforme o número selecionado anteiror que é ígual.
if(grupoh==1){
   //Imprimir a mensagem para classificação conforme foi anteriomente digitado.
   System.out.println("A seguir informe para saber lembrando que 1-Fluor e o 2-Astato"+"\n");

//Laço de repetição de i até 1 conforme o número informado a seguir.
for(i=0;i<1;i++){

   System.out.println("Informe o número para classificação do Grupo-H"+"\n");//Entrada de dado.
   num8=ler.nextInt();//Saída de dado.
   
   //Validação conforme o número selecionado anteiror que é ígual.
   if(num8==1){
   //Imprimir a mensagem para classificação conforme foi anteriomente digitado.
   System.out.println("Fluor contém Gase que corresponde a uma quantidade de massa atômica 18.9984032 e que é reconhecido pela sua sigla-F"+"\n");
    
   }else if(num8==2){
   //Imprimir a mensagem para classificação conforme foi anteriomente digitado.
       System.out.println("Astato contém Sólido que corresponde a uma quantidade de massa atômica de 210 e que é reconhecida pela sua sigla-A"+"\n");
    } 

      }
   } else if(grupoh==2){
   
       //Imprimir a mensagem para classificação conforme foi anteriomente digitado.
       System.out.println("Não quer saber sobre o Grupo-H a seguir terá outros grupos na sequência"+"\n");
   } 

   System.out.println("Deseja saber do Grupo-I para sim-[1] ou não-[2]"+"\n");//Entrada de dado.
    grupoi=ler.nextInt();//Saída de dado.
    //Validação conforme o número selecionado anteiror que é ígual.
if(grupoi==1){
   //Imprimir a mensagem para classificação conforme foi anteriomente digitado.
   System.out.println("A seguir informe para saber lembrando que 1-Európio e o 2-Urânio"+"\n");

//Laço de repetição de i até 1 conforme o número informado a seguir.
for(i=0;i<1;i++){

   System.out.println("Informe o número para classificação do Grupo-I"+"\n");//Entrada de dado.
   num9=ler.nextInt();//Saída de dado.
   
   //Validação conforme o número selecionado anteiror que é ígual.
   if(num9==1){
   //Imprimir a mensagem para classificação conforme foi anteriomente digitado.

System.out.println("Európio contém Sólido que corresponde a uma quantidade de massa atômica 151.964 e que é reconhecido pela sua sigla-Eu"+"\n");
   
   }else if(num9==2){
   
   //Imprimir a mensagem para classificação conforme foi anteriomente digitado.
    System.out.println("Urânio contém Sólido que corresponde a uma quantidade de massa atômica de 238.02891 e que é reconhecida pela sua sigla-U"+"\n");
     }
    } 

   }else if(grupoi==2){
   
       //Imprimir a mensagem para classificação conforme foi anteriomente digitado.
       System.out.println("Não quer saber sobre o Grupo-I tudo bem"+"\n");
   } 

//Imprimir a mensagem final para classificar.
System.out.println("Já finalizado os grupos");

}//Saída de bloco.
}//Saída de bloco.
