package escola;

public class Pessoa {

    private String nome;
    private int idade;

    // Método construtor : se criar uma pessoa de cara temos que informar os
    // parametros
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String newNome) {
        nome = newNome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int newIdade) {
        idade = newIdade;
    }
}
