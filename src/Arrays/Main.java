package Arrays;

public class Main {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(5);
        vetor.adicionaElementos("elemento 1");
        vetor.adicionaElementos("elemento 2");

        System.out.println(vetor.busca(1));
        System.out.println(vetor.busca("ELEMENTO 3"));
    }
}
