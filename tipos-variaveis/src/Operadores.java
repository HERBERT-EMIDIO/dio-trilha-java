public class Operadores {
    public static void main(String[] args) {
        // Operadores Aritméticos
        int a = 10, b = 5;
        System.out.println("Aritméticos:");
        System.out.println("a + b = " + (a + b));  // Adição
        System.out.println("a - b = " + (a - b));  // Subtração
        System.out.println("a * b = " + (a * b));  // Multiplicação
        System.out.println("a / b = " + (a / b));  // Divisão
        System.out.println("a % b = " + (a % b));  // Módulo

        // Operadores de Atribuição
        System.out.println("\nAtribuição:");
        a += b;  // a = a + b
        System.out.println("a += b: " + a);
        a -= b;  // a = a - b
        System.out.println("a -= b: " + a);
        a *= b;  // a = a * b
        System.out.println("a *= b: " + a);
        a /= b;  // a = a / b
        System.out.println("a /= b: " + a);
        a %= b;  // a = a % b
        System.out.println("a %= b: " + a);

        // Operadores Unários
        System.out.println("\nUnários:");
        System.out.println("a++: " + (a++));  // Pós-incremento
        System.out.println("++a: " + (++a));  // Pré-incremento
        System.out.println("a--: " + (a--));  // Pós-decremento
        System.out.println("--a: " + (--a));  // Pré-decremento
        boolean c = false;
        System.out.println("!c: " + (!c));    // Negação lógica

        // Operadores de Igualdade e Relacionais
        System.out.println("\nIgualdade e Relacionais:");
        System.out.println("a == b: " + (a == b));  // Igual a
        System.out.println("a != b: " + (a != b));  // Diferente de
        System.out.println("a > b: " + (a > b));    // Maior que
        System.out.println("a < b: " + (a < b));    // Menor que
        System.out.println("a >= b: " + (a >= b));  // Maior ou igual a
        System.out.println("a <= b: " + (a <= b));  // Menor ou igual a

        // Operadores Condicionais (Lógicos)
        System.out.println("\nCondicionais:");
        boolean d = true, e = false;
        System.out.println("d && e: " + (d && e));  // E lógico
        System.out.println("d || e: " + (d || e));  // OU lógico

        // Operador Ternário
        System.out.println("\nTernário:");
        String resultado = (a > b) ? "a é maior que b" : "a não é maior que b";
        System.out.println("Resultado: " + resultado);

        // Operadores Bitwise
        System.out.println("\nBitwise:");
        System.out.println("a & b: " + (a & b));  // AND bit a bit
        System.out.println("a | b: " + (a | b));  // OR bit a bit
        System.out.println("a ^ b: " + (a ^ b));  // XOR bit a bit
        System.out.println("~a: " + (~a));        // NOT bit a bit
    }
}
