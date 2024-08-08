public class Autodromo{
    public static void main(String[] args) {
        CarroAutomatico corola = new CarroAutomatico();
        corola.setChassi("123456");
        corola.ligar();


        CarroManual ka = new CarroManual();
        ka.setChassi("789456");
        ka.ligar();


    }
}