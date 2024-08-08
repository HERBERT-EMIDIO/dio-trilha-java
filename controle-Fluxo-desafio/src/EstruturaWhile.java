public class EstruturaWhile {

    int valor;
    int fatorial;

    public void fatorialNumero(int valor, int fatorial) {

        // Enquanto
        while (valor > 1) {
            fatorial *= valor;
            valor--;

        }
        System.out.println(fatorial);

    }

}