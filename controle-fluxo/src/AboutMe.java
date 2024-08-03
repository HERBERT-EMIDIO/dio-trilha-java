import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        // Tratando exceções
        try {

            Scanner sc = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome: ");
            String nome = sc.nextLine();

            System.out.println("Digite seu Sobrenome: ");
            String sobrenome = sc.nextLine();

            System.out.println("Digite sua idade: ");
            int idade = sc.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = sc.nextDouble();

        } catch (InputMismatchException e) { // Um tupo de alerta : na iidae colocar string
          //  System.out.println("Campos de idade e altura deverão ser numéricos!!");
            System.err.println("Campos de idade e altura deverão ser numéricos!!");
        }

    }

}
