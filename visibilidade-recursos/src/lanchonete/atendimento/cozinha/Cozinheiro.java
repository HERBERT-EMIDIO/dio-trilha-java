package lanchonete.atendimento.cozinha;


import lanchonete.atendimento.Atendente;

public class Cozinheiro {
    void adicionarLancheNoBalcao() {
        System.out.println("Lanche Preparado -  No Balcão");
    }

    private void adicionarSucoNoBalcao() {
        System.out.println("Lanche com Suco - No Balcão");
    }

    private void adicionarComboNoBalcao() {
        System.out.println("Lanche com Suco - No Balcão");
        adicionarLancheNoBalcao();

    }

    private void prepararLanche() {
        System.out.println("Preparando lanche tipo Hamburguer");
    }

    private void pedirTrocarGas(Almoxarife pessoa) {
        pessoa.AlmoxarifeTrocarGas();

    }

    private void pedirTrocarGas(Atendente pessoa) {
        pessoa.atendenteTrocarGas();

    }

}
