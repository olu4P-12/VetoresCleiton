import java.util.Scanner;

public class atividade08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        int[] A = new int[8];
        int[] B = new int[8];

        // Leitura dos valores para o vetor A
        System.out.println("Digite 8 números inteiros para o vetor A:");
        for (int i = 0; i < 8; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = sc.nextInt();
           
            B[i] = A[i] * 3;
        }

      
        System.out.println("\n=== Vetor B (A[i] * 3) ===");
        for (int i = 0; i < 8; i++) {
            System.out.println("B[" + i + "] = " + B[i]);
        }

        sc.close();
    }
}

