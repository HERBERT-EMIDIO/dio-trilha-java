package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class RandomicoSelecaoCandidato {

    public static void main(String[] args) {
        selecaoCandidatos();

    }

    //
    static void selecaoCandidatos() {
        String[] candidatos = { "Flelipe", "Herbert", "Emidio", "Maria", "Aline", "Lindalva" };

        int candidadosSelecionados = 0;
        int candidadosAtual = 0;
        double salarioBase = 2000.0;

        while (candidadosSelecionados < 3) {
            String nomeCandidato = candidatos[candidadosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println(
                    "O candidato " + nomeCandidato + " solicitou este valor de salário " + salarioPretendido + ".");

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + nomeCandidato + " foi selecionado para a vaga.");
                candidadosSelecionados++;
            }

            candidadosAtual++;
        }
    }

    // Método random
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    // Método mandar mensagem
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com uma contra Proposta");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }

}
