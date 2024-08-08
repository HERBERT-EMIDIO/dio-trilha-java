public class Veiculos {

    private String chassi;

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    // Método ligar
    public void ligar() {
        sistemaAutomatico();
        System.out.println("============== Carro Ligado ================");
    }

    public void sistemaAutomatico() {
        System.out.println("Sistema Automatico em Ação!\n");
        conferirCambio();
        conferirCombustivel();
    }

    private void conferirCombustivel() {
        System.out.println("Combustivel OK!");
        System.out.println("====================\n");
    }

    private void conferirCambio() {
        System.out.println("Cambio OK!");
        System.out.println("====================\n");
    }

}
