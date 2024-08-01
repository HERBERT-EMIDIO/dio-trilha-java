public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        double salarioMinimo = 2500.33;
        System.out.println(salarioMinimo);

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;//cast()
        
        // Declarar um valor que nunca poderá mudar com 'final' + nome em MAIUSCULO
        final int CPF = 3;
        final double VALOR_DE_PI = 13.14;

        // TEXTOS + Strings

        String nome = "Herbert Felipe";
    }
}


