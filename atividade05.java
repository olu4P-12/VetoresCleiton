import java.util.Scanner;

public class atividade05 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        String[] nomes = new String[4];


        for (int i = 1; i < nomes.length; i++) {
            System.out.print("Digite o nome da posição " + i + ": ");
            nomes[i] = scanner.nextLine();
        }


        System.out.println("\nNomes inseridos:");
        for (int i = 1; i < nomes.length; i++) {
            System.out.println("Posição " + i + ": " + nomes[i]);
        }


        scanner.close();
    }
}
