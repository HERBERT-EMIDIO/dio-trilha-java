import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] alunos = { "Camila", "Lucas", "Bruna", "Pedro" };

        double media = calculadoraMediaDaTurma(alunos, scan);

        System.out.printf("Média da turma %.1f", media); // %d=int, %f=double ou float, %s=String

    }

    public static int calculadoraMediaDaTurma(String[] alunos, Scanner scanner) {

       int soma = 0;
        for (String aluno : alunos) {
            System.out.printf("Notas do aluno %s: ", aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }

        return soma / alunos.length;

    }

}



/**
 * double soma = 0;
        for (int aluno = 0; aluno <= alunos.length; aluno++) {
            System.out.printf("Notas do aluno %s: ", alunos[aluno]);
            double nota = scanner.nextDouble();
            soma += nota;
        }

 */
