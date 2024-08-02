public class ResultadoEscolar {
    public static void main(String[] args) {

        int nota = 6;

        if (nota >= 9) {
            System.out.println("Aprovado - Com Hora");
        } else if (nota > 5 && nota <= 7) {
            System.out.println("Aprovado - Obrigação");
        } else if (nota == 5) {
            System.out.println("Recuperação - Se estudar Passa!");
        } else {
            System.out.println("Reprovado");
        }

        // outra forma usando ternário:
        String resultado = nota >= 7 ? "Aprovado": nota < 7 && nota >= 6 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}
