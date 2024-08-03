import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {

        double mesada = 50.0;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();

            if(valorDoce > mesada)
                valorDoce = mesada;


                System.out.println("Compra: " + valorDoce + " Saldo da mesada: " + mesada);
                mesada = mesada - valorDoce;
        

        }

    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
