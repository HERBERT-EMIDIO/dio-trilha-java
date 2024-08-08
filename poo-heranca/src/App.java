import msn.FacebookMessenger;
import msn.MsnMessager;
import msn.Telegram;

public class App {
    public static void main(String[] args) throws Exception {
    
        
        System.out.println("Serviço 01: Telegram");
        Telegram tele = new Telegram();
        tele.enviarMensagem();
        tele.receberMensagem();
        tele.apresentacaoMensagem();
        
        System.out.println("Serviço 02: MSN");
        MsnMessager msn = new MsnMessager();
        msn.enviarMensagem();
        msn.receberMensagem();
        msn.apresentacaoMensagem();
        
        System.out.println("Serviço 03: Facebook");
        FacebookMessenger faceboo = new FacebookMessenger();
        faceboo.enviarMensagem();
        faceboo.receberMensagem();
        faceboo.apresentacaoMensagem();
        


        

    }
}
