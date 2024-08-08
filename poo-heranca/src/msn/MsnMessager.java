package msn;

public class MsnMessager extends ServicoMsn {

    @Override
    public void enviarMensagem() {
        validarMensagem();
        System.out.println("Enviando mensagem: Msn");
        salvarHistoricoMensagem();

    }

    @Override
    public void apresentacaoMensagem() {
        System.out.println("Oi eu sou MSN");
    }

}