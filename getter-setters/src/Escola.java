import escola.Pessoa;

public class Escola {
    public static void main(String[] args) {

        Pessoa aluno = new Pessoa("Herbert", 41);
        aluno.setNome("Felipe");
        System.out.printf("Aluno: %s \n", aluno.getNome());

        aluno.setIdade(27);
        System.out.printf("Aluno: %s com uma Idade: %d", aluno.getNome(), aluno.getIdade());

    }

}
