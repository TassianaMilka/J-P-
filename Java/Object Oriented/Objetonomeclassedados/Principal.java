//Realiza uma Orientação a Objeto simples o nome e ano lançamento de um desenho animado.



import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {


        System.out.println("\n\n");


        Dados dado=new Dados();

        dado.PromocaoP="(Primeira Promoção)-1 Caderno de 30 matérias,1 Agenda,5 Canetas,1 Caixa de canetas coloridas e 1 Bloco  de anotação.";
        dado.PromocaoS="(Segunda Promoção)- 2 Caderno de 30 matérias,2 Agenda,8 Canetas, 2 Caixa de canetas coloridas,2 Bloco de anotação, 1 Caderno de 1 uma Matéria.";
        dado.PromocaoT="(Terceira Promoção)- 3 Caderno de 30 matérias,4 Agenda,15 Canetas, 3 Caixa de canetas coloridas,3 Bloco de anotação, 2 Caderno de 1 uma Matéria e 2 Caderno de desenho, 1 Caixa de lápis de cor.";


        dado.dadosProduto();


        System.out.println("\n\n");


        Scanner leitura = new Scanner(System.in);

        int opcao=0;

        while(opcao!=4) {

            System.out.println("\n\n");
            //Entrada de dado e saída de dado
            System.out.println("Informe a escolha que deseja para saber o valor total conforme descrito\n");
            System.out.println("[1]-Primeira Promoção\n" +
                    "[2]-Segunda Promoção\n" +
                    "[3]-Terceira Promoção\n" +
                    "[4]-Sair");
            int escolha = leitura.nextInt();
            switch (escolha) {

                case 1:

                    String primeiraP="Primeira Promoção";
                    System.out.println(primeiraP);

                    double resultadoP=123-100;
                    System.out.println(resultadoP+"\n");

                    break;

                case 2:

                    String segundaS="Segunda Promoção";
                    System.out.println(segundaS);

                    double resultadoS=223-110;
                    System.out.println(resultadoS+"\n");


                    break;

                case 3:

                    String terceiraT="Terceira Promocação";
                    System.out.println(terceiraT);

                    double resultadoT=323-120;
                    System.out.println(resultadoT+"\n");


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
