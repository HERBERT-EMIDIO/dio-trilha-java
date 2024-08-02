public class PlanoOperadora {
    public static void main(String[] args) {

        // Escolha seu plano de ligação
        // B = 100 minutos
        // M = 100 minutos + whatsapp free
        // T = 100 minutos + Whatsapp free + Instagram + Youtube

        String PlanoLigação = "T";

        switch (PlanoLigação) {
            case "B": {

                System.out.println(" Seu plano é:  100 minutos");
            }
                break;
            case "M": {

                System.out.println(" Seu plano é:  100 minutos  + whatsapp free");
            }
                break;
            case "T": {

                System.out.println("Seu plano é:  100 minutos  + whatsapp free + Instagram + Youtube");
            }
                break;
            default: {

                System.out.println("Plano não definido!");
            }

        }

    }

}
