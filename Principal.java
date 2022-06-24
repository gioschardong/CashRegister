import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        // Introdução
        // > cria a caixa registradora
        CashRegister cr = new CashRegister();
        Scanner in = new Scanner(System.in);

        // Desenvolvimento
        // menu de opçoes
        int opcao = 0;
        do {
            opcao = menu();
            switch (opcao) {
                // Inserir Preço
                case 1:
                    double precoDoProduto;
                    System.out.print("Informe o valor do produto: R$ ");
                    precoDoProduto = in.nextDouble();

                    cr.addItem(precoDoProduto);
                    break;
                // Apresenta o valor a ser pago
                case 2:
                    System.out.printf("O valor a ser pago é de R$ %.2f\n", cr.getTotal());
                    break;
                // Apresenta o numero de produtos registrados
                case 3:
                    System.out.println("O numero de produtos registrados é: " + cr.getCount());
                    break;
                // Inicia uma nova venda
                case 4:
                    cr.clean();
                    break;
                default:
                    System.out.println("Valor não tratado");
                    break;
            }
        } while (opcao != 0);
        // Conclusão
        // mensagem de fim de programa
        System.out.println("Fim do Programa");
    }

    public static int menu() {
        Scanner usr = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Menu de opcoes");
            System.out.println("  1 - Adicionar um item");
            System.out.println("  2 - Total a ser pago");
            System.out.println("  3 - Nro de itens da compra");
            System.out.println("  4 - Inicia nova operacao");
            System.out.println("  0 - Sair do programa");
            System.out.print("Escolha a opcao:");
            opcao = usr.nextInt();
            if ((opcao < 0) || (opcao > 4))
                System.out.println("Opcao inválida");
        } while ((opcao < 0) || (opcao > 4));

        return opcao;
    }
}