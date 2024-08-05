public class TratamentoExcecao02 {
    public static void main(String[] args) {

        int [] numeros = new int[] {10, 20, 30, 100};
        int [] peso = new int[] {2, 3, 4, 5};


        try{
            System.out.println("Numeros: ");
            System.out.println("Numeros: "+ numeros[3]);
            System.out.println("Mensagens após a exceção");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("messagen final");



        
    }
    
}
