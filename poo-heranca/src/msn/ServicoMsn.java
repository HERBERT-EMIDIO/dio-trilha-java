package msn;

public abstract class ServicoMsn {

    public void enviarMensagem() {
        validarMensagem();

        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem\n");
    }

    protected void validarMensagem() {
        System.out.println("Validação da Conexão! OK");
    }

    protected void salvarHistoricoMensagem() {
        System.out.println("Salvando Mensagem");
    }

    // Abstração
    public abstract void apresentacaoMensagem();

}
