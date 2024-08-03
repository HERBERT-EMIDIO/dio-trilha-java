import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {

        // Exemplo 01:
        // Number valor = Double.valueOf("a1.75");
        // System.out.println(valor);

        // Exemplo 02: com a tratativa do erro
        Number valor;
        try {
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
