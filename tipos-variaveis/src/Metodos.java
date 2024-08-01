public class Metodos {

    public static void main(String[] args) {
        // Tipos de variáveis primitivas
        int inteiro = 10;
        double decimal = 5.5;
        char caractere = 'A';
        boolean booleano = true;

        // Exibir informações sobre variáveis e operadores
        exibirOperadoresAritmeticos(inteiro, decimal);
        exibirOperadoresAtribuicao(inteiro, decimal);
        exibirOperadoresUnarios(inteiro, booleano);
        exibirOperadoresRelacionais(inteiro, decimal);
        exibirOperadoresCondicionais(inteiro, decimal);
        exibirOperadorTernario(inteiro);
        exibirOperadoresBitwise(inteiro);

        // Variáveis de referência
        String texto = "Hello, Herbert Felipe!";
        System.out.println("\nVariáveis de Referência:");// println para pular linha
        System.out.println("texto: " + texto);
    }

    // 1. Métodos para exibir operadores aritméticos
    public static void exibirOperadoresAritmeticos(int inteiro, double decimal) {
        System.out.println("Operadores Aritméticos:");
        System.out.println("inteiro + 5 = " + (inteiro + 5));
        System.out.println("decimal * 2 = " + (decimal * 2));
    }

    // 2. Métodos para exibir operadores de atribuição
    public static void exibirOperadoresAtribuicao(int inteiro, double decimal) {
        System.out.println("\nOperadores de Atribuição:");
        inteiro += 3;  // inteiro = inteiro + 3
        decimal -= 1.5;  // decimal = decimal - 1.5
        System.out.println("inteiro += 3: " + inteiro);
        System.out.println("decimal -= 1.5: " + decimal);
    }

    // 3. Métodos para exibir operadores unários ++ -- !
    public static void exibirOperadoresUnarios(int inteiro, boolean booleano) {
        System.out.println("\nOperadores Unários:");
        inteiro++;  // Pós-incremento
        booleano = !booleano;  // Negação lógica
        System.out.println("inteiro++: " + inteiro);
        System.out.println("!booleano: " + booleano);
    }

    // 4. Métodos para exibir operadores relacionais
    public static void exibirOperadoresRelacionais(int inteiro, double decimal) {
        System.out.println("\nOperadores Relacionais:");
        boolean isEqual = (inteiro == 13);
        boolean isGreater = (decimal > 3.0);
        System.out.println("inteiro == 13: " + isEqual);
        System.out.println("decimal > 3.0: " + isGreater);
    }

    // 5. Métodos para exibir operadores condicionais
    public static void exibirOperadoresCondicionais(int inteiro, double decimal) {
        System.out.println("\nOperadores Condicionais:");
        boolean isEqual = (inteiro == 13);
        boolean isGreater = (decimal > 3.0);
        boolean logicoE = (isEqual && isGreater);
        boolean logicoOU = (isEqual || isGreater);
        System.out.println("isEqual && isGreater: " + logicoE);
        System.out.println("isEqual || isGreater: " + logicoOU);
    }

    // 6. Métodos para exibir operador ternário
    public static void exibirOperadorTernario(int inteiro) {
        System.out.println("\nOperador Ternário:");
        String resultado = (inteiro > 10) ? "inteiro é maior que 10" : "inteiro não é maior que 10";
        System.out.println("Resultado: " + resultado);
    }

    // 7. Métodos para exibir operadores bitwise
    public static void exibirOperadoresBitwise(int inteiro) {
        System.out.println("\nOperadores Bitwise:");
        System.out.println("inteiro & 1: " + (inteiro & 1));  // AND bit a bit
        System.out.println("inteiro | 1: " + (inteiro | 1));  // OR bit a bit
    }
}
