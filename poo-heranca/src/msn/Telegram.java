package msn;

public class Telegram extends ServicoMsn {

    @Override
    public void enviarMensagem() {
        validarMensagem();
        System.out.println("Enviando mensagem: Telegram");
        salvarHistoricoMensagem();

    }

    @Override
    public void apresentacaoMensagem() {
        System.out.println("Oi eu sou: Telegram");
    }



   
    
}
