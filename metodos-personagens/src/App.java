public class App {
    public static void main(String[] args) throws Exception {

        // Criar um objeto : <tipo> nome = new class();

        Personagens heroi = new Personagens();
        heroi.nome = "Hércules";
        heroi.nivel = 2;
        heroi.forca = 16;

        heroi.arma = "Faca";

        // Personagem: <nome> (lvl <nivel>) com <forca> de força.
        heroi.mostrarStaus();
        heroi.atacar();
        heroi.atacarArma("Espada");
        heroi.atacarArma(heroi.arma);

    }
}
