package Orçamentopreço;

 //Programando em Java(13) or Programming in Java(13).


//Em uma loja um determinado cliente quer fazer orçamento de valor de dois produtos nesse caso a necessidade de realizar uma forma que possa saber o valor do primeiro produto equivalente de  670,00 reais 
//como uma entrada de dado,utilizar o laço de repetição de n e se caso acontece de saber só de um valor no último momento ou saber do outro  de 820,00 reais também a um laço de repetição de i até 1 fazendo 
//uma soma para saber o total nessa sequência conter validação sejá menor que 1256,maior 1789 ou igual a 1490 e no final uma mensagem para classificar dessa maneira "Finalizado orçamento deixamos o nosso agradecimento". 


import java.util.Scanner;

public class Orçamentopreço { // Nome da Classe e entrada de bloco

    
    public static void main(String[] args) {// Entrada de bloco

        Scanner ler = new Scanner(System.in);// Comando utilizado para fazer a leitura dos dados digitados na leitura.

        // Declaração das Váriaveis
        int produto;
        int n;
        double calcular;
        int i;
        double valor1;
        double valor2;

                    



        System.out.println(" "+"\n");

        System.out.println("Informe a quantidade de vezes vai ser digitado" + "\n");// Entrada de dado
        n = ler.nextInt();// Saída de dado
        // laço de repetição de 1 até n conforme digitado anteriormente
        for (i = 0; i < n; i++) {

            System.out.println("Informa o valor_1 do produto" + "\n");// Entrada de dado
            valor1 = ler.nextDouble();// Saída de dado

            // Imprimir a mensagem para classificar o valor do produto
            System.out.println("O valor do produto é=" + valor1);
            System.out.println("\n");
        }

        System.out.println("Informa se deseja saber o valor do outro produto para sim-[1] e não-[2]");// Entrada de dado
        produto = ler.nextInt();// Saída de dado

        // Validação para classificar caso digita se deseja saber o valor do produto
        if (produto == 1) {

            // laço de repetição de 1 até n conforme digitado anteriormente
            for (i = 0; i < 1; i++) {

                System.out.println("Informa o valor_2 do produto" + "\n");// Entrada de dado
                valor2 = ler.nextDouble();// Saída de dado

                // Imprimir a mensagem para classificar o valor do produto
                System.out.println("O valor do produto é=" + valor2);
                System.out.println("\n");

                // Imprimir a mensagem para classificar para próxima etapa do orçamento
                System.out.println(
                        "A seguir vai ser realizado um cálculo na finalidade de saber o resultado total do orçamento"
                                + "\n" + "\n");

                System.out.println("Informe o valor_1" + "\n");// Entarda de dado
                valor1 = ler.nextDouble();// Saída de dado

                System.out.println("Informe o valor_2" + "\n");// Entarda de dado
                valor2 = ler.nextDouble();// Saída de dado

                // Realizar o calculo para saber o resultado final
                calcular = valor1 + valor2;

                // Imprimir a mensagem do resultado do cálculo sobre o orçamento

                System.out.println("O resultado do cálculo" + "\n" + calcular);

                // Validação de dado para que possa classicar se foi digitado o valor
                // maior,menor ou igual
                if (calcular < 1256) {

                    // Imprimir a mensagem para classificar conforme o que foi informado
                    // anteriormente antes na validação
                    System.out.println("Necessita de mais dinheiro para comprar" + "\n");

                }
                if (calcular > 1789) {

                    // Imprimir a mensagem para classificar conforme o que foi informado
                    // anteriormente antes na validação
                    System.out.println("O dinheiro que contém pode comprar,mas a um retorno de troco" + "\n");

                } else if (calcular == 1490) {

                    // Imprimir a mensagem para classificar conforme o que foi informado
                    // anteriormente antes na validação
                    System.out.println(
                            "O dinheiro que contém pode comprar e sem a necessidade de retorno do troco" + "\n");

                }

            }
        } else if (produto == 2) {

            // Imprimir a mensagem para classificar caso não deseja saber mais nada também o
            // total só do primeiro produto selecionado
            System.out.println("Já que não deseja saber sobre tudo bem" + "\n");

            System.out.println("O total relacionado foi só do valor primeiro" + "\n");
            System.out.println("\n");

        }

        System.out.println("\n");

        // Imprimir a mensagem final
        System.out.println("Finalizado orçamento deixamos o nosso agradecimento" + "\n");

        System.out.println("\n" + "\n");

    } // Saída de bloco

}// Saída de bloco
