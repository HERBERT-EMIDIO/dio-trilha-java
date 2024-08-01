public class TiposVariaveis {
    public static void main(String[] args) {
        // Tipos de variáveis primitivas
        int inteiro = 10;
        double decimal = 5.5;
        char caractere = 'A';
        boolean booleano = true;

        // Exemplo de operadores com diferentes tipos de variáveis
        System.out.println("Variáveis Primitivas e Operadores:");

        // Operadores Aritméticos
        System.out.println("\nAritméticos:");
        int soma = inteiro + 5;
        double multiplicacao = decimal * 2;
        System.out.println("inteiro + 5 = " + soma);
        System.out.println("decimal * 2 = " + multiplicacao);

        // Operadores de Atribuição
        System.out.println("\nAtribuição:");
        inteiro += 3;  // inteiro = inteiro + 3
        decimal -= 1.5;  // decimal = decimal - 1.5
        System.out.println("inteiro += 3: " + inteiro);
        System.out.println("decimal -= 1.5: " + decimal);

        // Operadores Unários
        System.out.println("\nUnários:");
        inteiro++;  // Pós-incremento
        booleano = !booleano;  // Negação lógica
        System.out.println("inteiro++: " + inteiro);
        System.out.println("!booleano: " + booleano);

        // Operadores de Igualdade e Relacionais
        System.out.println("\nIgualdade e Relacionais:");
        boolean isEqual = (inteiro == 13);
        boolean isGreater = (decimal > 3.0);
        System.out.println("inteiro == 13: " + isEqual);
        System.out.println("decimal > 3.0: " + isGreater);

        // Operadores Condicionais (Lógicos)
        System.out.println("\nCondicionais:");
        boolean logicoE = (isEqual && isGreater);
        boolean logicoOU = (isEqual || isGreater);
        System.out.println("isEqual && isGreater: " + logicoE);
        System.out.println("isEqual || isGreater: " + logicoOU);

        // Operador Ternário
        System.out.println("\nTernário:");
        String resultado = (inteiro > 10) ? "inteiro é maior que 10" : "inteiro não é maior que 10";
        System.out.println("Resultado: " + resultado);

        // Operadores Bitwise
        System.out.println("\nBitwise:");
        int bitwiseAND = inteiro & 1;  // AND bit a bit
        int bitwiseOR = inteiro | 1;   // OR bit a bit
        System.out.println("inteiro & 1: " + bitwiseAND);
        System.out.println("inteiro | 1: " + bitwiseOR);

        // Variáveis de referência
        String texto = "Hello, Java!";
        System.out.println("\nVariáveis de Referência:");
        System.out.println("texto: " + texto);
    }
}
