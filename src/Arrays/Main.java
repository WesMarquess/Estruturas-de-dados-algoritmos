package Arrays;

public class Main {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(5);
        vetor.adicionaElementos("Wes");
        vetor.adicionaElementos("Wes 2");

        System.out.println(vetor.tamanho());

        System.out.println(vetor);
    }
}
