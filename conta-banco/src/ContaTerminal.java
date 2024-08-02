import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        /*
         * 
         * int numero = 1021;
         * String agencia = "067-8";
         * String nomeCliente = "Mario Andrade";
         * float saldo = 237.48F;
         * 
         */

        // importar o java.util e usar a classe scanner para receber informacao no
        // console
        Scanner scan = new Scanner(System.in);

        // Solicitar ao Usuário as informaçoes da conta;

        System.out.println("=======================================");
        System.out.println("Por favor, digite  do número da conta!");
        int numero = scan.nextInt();
        scan.nextLine();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scan.nextLine();

        System.out.println("========================================");
        System.out.println("Por favor, digite o nome do cliente!");
        String nomeCliente = scan.nextLine();

        System.out.println("========================================");
        // Definir o saldo
        double saldo = 237.48;

        // Mensagem de Boas Vindas
        String boasVindas = """

                Olá, %s, somos o Banco <Dio>.

                    """.formatted(nomeCliente);

        System.out.println(boasVindas);

        // Formatação e exibição da mensagem
        System.out.printf(
                "Olá, %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.%n",
                nomeCliente, agencia, numero, saldo);

        // Fechar o Scanner
        scan.close();
    }
}
