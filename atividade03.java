public class atividade03 {
    public static void main(String[] args) {
        // Declaração e atribuição inicial
        int[] vetor = new int[2];
        vetor[0] = 5;
        vetor[1] = 10;

        System.out.println("Valores originais:");
        System.out.println("vetor[0] = " + vetor[0]);
        System.out.println("vetor[1] = " + vetor[1]);

        // Troca dos valores usando variável auxiliar
        int aux = vetor[0];
        vetor[0] = vetor[1];
        vetor[1] = aux;

        System.out.println("\nValores após a troca:");
        System.out.println("vetor[0] = " + vetor[0]);
        System.out.println("vetor[1] = " + vetor[1]);
    }
}
