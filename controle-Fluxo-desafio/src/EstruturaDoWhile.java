public class EstruturaDoWhile {

    public void estruturaDoWhile(int cont) {

        do {
            System.out.println("Estrutura Do_While\n");
            System.out.printf("Contador : %d%n", cont);
            cont++;
        } while (cont < 15);

        System.out.format("\nTerminando com: %d",cont);
    }

}
