import com.emidio.escola.Aluno;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Aluno a1 = new Aluno();
        a1.matricular();


        // Classe com o mesmo nome: como devemos fazer
        // https://www.youtube.com/watch?v=yQbh1ILlijk&list=PL0YuSuacUEWtnWE0zVGKw3qDcEJEpNeZb&index=3
        com.emidio.curso.Aluno a2 = new com.emidio.curso.Aluno();
        a2.matricular();


    }
}
