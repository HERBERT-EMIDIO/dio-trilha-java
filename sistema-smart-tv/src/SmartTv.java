public class SmartTv {

    // =================== Atributos ====================
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    // ================= Métodos sem parâmetros ==============
    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    // Volume
    public void aumentarVolumeBotaoSetaParaDireita() {
        volume++;
    }

    public void diminuirVolumeBotaoSetaParaDireita() {
        volume--;
    }

    // Canal
    public void mudarDeCanalBotaoSetaParaCima() {
        canal++;
    }

    public void mudarDeCanalBotaoSetaParaBaixo() {
        canal--;
    }

    // =========== Métodos com um parâmetro ===========

    // Volume
    public int aumentarVolume(int value) {
        return volume = volume + value;
    }

    public int diminuirVolume(int value) {
        return volume -= value;
    }

    // Canal
    public int mudarCanal(int novoCanal) {
        return canal = novoCanal;
    }

}
