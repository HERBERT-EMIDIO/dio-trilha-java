public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        EstruturaWhile usandoWhileFatorial = new EstruturaWhile();

        usandoWhileFatorial.valor = 5;
        usandoWhileFatorial.fatorial = 1;

        usandoWhileFatorial.fatorialNumero(usandoWhileFatorial.valor, usandoWhileFatorial.fatorial);

        // Do While

        EstruturaDoWhile estruturaDoWhile = new EstruturaDoWhile();

        estruturaDoWhile.estruturaDoWhile(10);

        //For

        EstruturaForTabuada tabuada8 = new EstruturaForTabuada();

        tabuada8.tabuadaFor(8);

    }
}
