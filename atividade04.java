import java.util.Scanner;

public class atividade04 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        int[] numeros = new int[4];
        int soma = 0;


        for (int i = 1; i < numeros.length; i++) {
            System.out.print("Digite o número da posição " + i + ": ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }


        System.out.println("\nValores inseridos no vetor:");
        for (int i = 1; i < numeros.length; i++) {
            System.out.println("Posição " + i + ": " + numeros[i]);
        }


        double media = (double) soma / numeros.length;
        System.out.printf("\nMédia dos valores: %.2f\n", media);


        scanner.close();




    }
}

