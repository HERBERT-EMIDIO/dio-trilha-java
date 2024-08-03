public class FormatadorCepExemplo {
//aula: https://www.youtube.com/watch?v=vYbwbyg-B8A
    public static void main(String[] args) {
        try {
            String cepFormatado = formatCep("51.230-64");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            e.printStackTrace();
        }

    }

    static String formatCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException();

            // Simulando um cep formatado
            return "50.630-240";
        }
    }

}
