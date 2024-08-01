public class Usuario {
    public static void main(String[] args) throws Exception {

        // Criando a SmartTV:    
        SmartTv minhaSmartTv = new SmartTv();

        System.out.println("Ligada: "+ minhaSmartTv.ligada);
        System.out.println("Volume: "+ minhaSmartTv.volume);
        System.out.println("Canal: "+ minhaSmartTv.canal);
        System.out.println();
        
        // Chamada do método para ligar:
        minhaSmartTv.ligar();
        System.out.println("Ligada: " + minhaSmartTv.ligada);
        minhaSmartTv.desligar();
        System.out.println("Ligada: " + minhaSmartTv.ligada);
        System.out.println();
        
        // Camada do método para aumentar o Volume dizendo o parâmetro
        minhaSmartTv.aumentarVolume(20);
        System.out.println("Volume Aumentado: "+ minhaSmartTv.volume);
        
        minhaSmartTv.diminuirVolume(45);
        System.out.println("Volume diminuido: "+ minhaSmartTv.volume);
        System.out.println();
        
        // Mudar de canal
        minhaSmartTv.mudarCanal(13);
        System.out.println();
        
        minhaSmartTv.mudarDeCanalBotaoSetaParaCima();
        System.out.println("Canal: "+ minhaSmartTv.canal);
        System.out.println();
        minhaSmartTv.mudarDeCanalBotaoSetaParaBaixo();
        System.out.println("Canal: "+ minhaSmartTv.canal);
        System.out.println();

    }
}
