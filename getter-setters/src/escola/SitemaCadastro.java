package escola;

public class SitemaCadastro {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Emidio", 20);

        System.out.printf("Nome %s e idade %d\n",pessoa.getNome(), pessoa.getIdade());

    }
    
}
