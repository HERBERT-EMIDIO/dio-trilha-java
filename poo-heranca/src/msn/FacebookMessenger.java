package msn;

public class FacebookMessenger extends ServicoMsn {

    @Override
    public void enviarMensagem() {
        validarMensagem();
        System.out.println("Enviando mensagem:Facebook");
        salvarHistoricoMensagem();
    }

    @Override
    public void apresentacaoMensagem() {
        System.out.println("Oi eu sou: Facebook");
    }
    
}
