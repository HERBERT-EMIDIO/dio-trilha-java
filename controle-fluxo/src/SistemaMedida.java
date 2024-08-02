import java.util.Scanner;

public class SistemaMedida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Informe o Tamanho da da roupa que deseja: P | M | G ");
        // String sigla = sc.nextLine();
        // Limpar o buffer do scanner após a leitura do número
        // sc.nextLine();
        String sigla = "g";
        if (sigla == "P") {
            System.out.println("Tamanho: Pequeno");
        } else if (sigla == "M") {
            System.out.println("Tamanho: Médio");
        } else if (sigla == "G") {
            System.out.println("Tamanho: Grande");
        }

        // Usando o switch Case

        switch (sigla) {
            case "P":
                System.out.println("Tamanho: Pequeno");
                break;
            case "M":
                System.out.println("Tamanho: Médio");
                break;
            case "G":
                System.out.println("Tamanho: Grande");
                break;
            default:
                System.out.println("Opção inválida!!");

        }
    }
}
