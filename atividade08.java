import java.util.Scanner;

public class atividade08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Vetor A com 8 posições
        int[] A = new int[8];
        int[] B = new int[8];

        // Leitura dos valores para o vetor A
        System.out.println("Digite 8 números inteiros para o vetor A:");
        for (int i = 0; i < 8; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = sc.nextInt();
            // Construção do vetor B: cada elemento de A multiplicado por 3
            B[i] = A[i] * 3;
        }

        // Exibição do vetor B
        System.out.println("\n=== Vetor B (A[i] * 3) ===");
        for (int i = 0; i < 8; i++) {
            System.out.println("B[" + i + "] = " + B[i]);
        }

        sc.close();
    }
}
