import java.util.Scanner;

public class atividade06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] numeros = new int[10];


        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            numeros[i] = scanner.nextInt();
        }


        System.out.println("\nNúmeros pares inseridos:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println("Posição " + i + ": " + numeros[i]);
            }
        }


    }
}