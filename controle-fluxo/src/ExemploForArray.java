public class ExemploForArray {

    public static void main(String[] args) {
        String alunos [] = {"Felipe", "Jonas", "Julia", "Marcos"};


        for(int indice = 0; indice < alunos.length; indice ++){
            System.out.println("Alunos : "+ indice+" Nome : "+ alunos[indice]);
        }


        // Usando o for each

        for(String aluno : alunos){
            System.out.println("Nome do aluno: "+aluno);
        }
    }
    
}
