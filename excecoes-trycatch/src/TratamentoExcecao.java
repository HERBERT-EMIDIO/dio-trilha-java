public class TratamentoExcecao {
    public static void main(String[] args) {

        int[] numeros = new int[] { 10, 20, 30 };
        System.out.println("Número posição: (1): " + numeros[0]);

        // se caso eu coloque uma posicao que nao existe no meu array?
        // aparecerá uma excecao
        // System.out.println(numeros[3]);
        /**
         * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3
         * out of bounds for length 3
         * at TratamentoExcecao.main(TratamentoExcecao.java:9)
         */

        // fazer o tratamento:
        // try = tentar
        // catch = capturar = vai tratar o erro encontrado no try

        int[] peso = new int[] { 2, 3, 4, 5 };

        try {
            int[] listaNumeros = new int[] { 50, 60, 70 };
            System.out.println("Lista de números na posição (3):" + listaNumeros[3]); // Index 3 out of bounds for
                                                                                      // length 3
            // achou a excecao faz o tratamento e continua /..

        } catch (Exception erro) {
            // tratar os erros
            // imprimir
            // criar aequivo de log
            System.out.println(erro.getLocalizedMessage());
        }

        System.out.println("Mensagem Final!");

    }

}
