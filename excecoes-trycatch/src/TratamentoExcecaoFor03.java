public class TratamentoExcecaoFor03 {
    //https://www.youtube.com/watch?v=BG4kOOfbOjc
    public static void main(String[] args) {

        int[] numeros = new int[] { 10, 20, 30, 100 };
      //  int[] peso = new int[] { 2, 3, 4, 5 };
        int[] peso = new int[] { 2, 0, 4 };

        try {

            for (int i = 0; i < numeros.length; i++) {
                int resultado = numeros[i] / peso[i];
                System.out.println(resultado);

                // Formatando o print:
                //10 / 2 = 5
                //20 / 0 =  / by zero
                //30 / 4 = 5
                //100 / ???? = excecao : Index 3 out of bounds for length
                System.out.printf("%d / %d = %d \n", numeros[i], peso[i], resultado);
            }

            // System.out.println("Numeros: ");
            // System.out.println("Numeros: " + numeros[3]);
            System.out.println("Mensagens após a exceção");

        } catch (Exception e) {
           // System.out.println(e.getMessage());
           e.printStackTrace(); // saber onde aconteceu a excecao: at TratamentoExcecaoFor03.main(TratamentoExcecaoFor03.java:11)
        }

        System.out.println("messagen final");
    }

}
