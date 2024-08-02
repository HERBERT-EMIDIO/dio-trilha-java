public class CaixaEletronica {

    public static void main(String[] args) {

        double saldo = 2.0;
        double valorSolicitado = 17.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Seu saldo atualizado: " + saldo);
        } else {
            System.out.println("Saldo Insuficiente");
        }

        // outra forma usando Condição Ternária:

        String consultaSaldo = saldo > 0.0 ? "Há saldo em conta" : "Sua conta está Zerada";
        System.out.println(consultaSaldo);

    }

}
