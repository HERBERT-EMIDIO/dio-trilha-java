public class Personagens{
   

    String nome;
    int nivel;
    int forca;
    String arma;

 
    // Método para mostrar status: https://www.youtube.com/watch?v=J-aLaXX5ZrU&list=PLGPluF_nhP9oNl6vAwapJNqkWA8_CxRuy&index=3
    void mostrarStaus(){
        System.out.printf("Personagem: %s com Level: %d e força: %d\n", nome, nivel, forca);

    }


    void atacar(){
        System.out.format("%s atacou e causou %d de dano.\n", nome, forca);
    }

    void atacarArma(String objeto){
        System.out.format("%s atacou com uma  %s de dano.\n", nome, objeto);
    }

    

}