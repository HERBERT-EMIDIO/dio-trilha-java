public class SmartTv {

    //Atributos
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    //Métodos
    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    //Método com um parâmetro
    public int aumentarVolume(int value){
        return volume = volume + value;
    }

    public int diminuirVolume(int value){
        return volume-=value;
    }

}
