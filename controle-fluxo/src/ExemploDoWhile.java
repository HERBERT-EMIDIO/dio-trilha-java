import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {

    System.out.println("Discando...");

    do{
        System.out.println("Telefone tocando!");

    }while(tocando());
    
    System.out.println("Aló!!!");



        
    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1; // entre 1 & 3
        System.out.println("Atendeu? " + atendeu);
        return !atendeu; // negando o atendimento
    }
}
