//Programando em Java(26) or Programming in Java(26).


//Em um resturante necessitam de um sistema  para os cliente selecionar a compra de marmitas
//que a pequena  é de R$15,00,média R$27,00 e grande R$36,00 contendo sobremesa para escala se o
//cliente deseja e  realiza uma API REST com os dados.


import java.util.Scanner;

public class EscolhadeMarmita {//Nome da Classe


    public static void main(String[] args) {


        System.out.println("\n\n");


        Scanner leitura = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 4) {

            System.out.println("\n\n");
            //Entrada de dado e saída de dado
            System.out.println("Informe o tamanho de Marmita que Deseja Comprar\n");
            System.out.println("[1]-Marmita pequena R$15,00\n" +
                    "[2]-Marmita média R$27,00\n" +
                    "[3]-Marmita grande R$36,00\n" +
                    "[4]-Sair");
            int escolha = leitura.nextInt();
            switch (escolha) {

                case 1:

                    String Realizadop = "Pedido realizado com Sucesso!";

                    System.out.println(Realizadop);

                    break;

                case 2:

                    String Realizadom = "Pedido realizado com Sucesso!";

                    System.out.println(Realizadom);


                    break;

                case 3:


                    String Realizadog = "Pedido realizado com Sucesso!";

                    System.out.println(Realizadog);


                    System.out.println("Deseja sobremesa sim-[1] ou não-[2]\n");
                    int informa = leitura.nextInt();

                    if (informa ==1) {


                        System.out.println("Confirmado o pedido!");


                    } else if (informa==2) {


                        System.out.println("Ok, não iremos colocar junto no pedido!");

                    }

                    else{

                        System.out.println("Acessa novamente para responder!");
                    }


                    break;

                case 4:

                    System.out.println("Sair!");

                    break;

                default:

                    System.out.println("Tente novamente!\n");

            }


        }


    }
}
