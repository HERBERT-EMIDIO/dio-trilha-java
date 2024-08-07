public class App {
    public static void main(String[] args) throws Exception {

        // Criacao de Celulares: <tipoVariavel> nomeVariavel = valor
        // 1. Iphone 12, tela de 6.2" , 256gb
        // 2. Galaxy Note 20 Ultra, tela de 6.9" , 256gb
        // 3. Xiaomi 11 Pro, tela de 6.81" , 128gb

        // Criacao e instanciando um obj
        Celular celular1 = new Celular();
        celular1.nome = "Iphone 12";
        celular1.temanhoTela = 6.1F;
        celular1.espacoArmazenamento = 256;
        celular1.sistemaOperacional = "ios";

        System.out.printf("Celular %s com tela %.1f, com %dgb e SO %s\n", celular1.nome, celular1.temanhoTela,
                celular1.espacoArmazenamento, celular1.sistemaOperacional);

        // Criacao do Segundo celular
        Celular celular2 = new Celular();
        celular2.nome = "Galaxy Note 20 Ultra";
        celular2.temanhoTela = 6.9F;
        celular2.espacoArmazenamento = 256;
        celular2.sistemaOperacional = "Android";

        System.out.printf("Celular %s com tela %.1f, com %dgb e SO %s\n", celular2.nome, celular2.temanhoTela,
                celular2.espacoArmazenamento, celular2.sistemaOperacional );

    }
}
