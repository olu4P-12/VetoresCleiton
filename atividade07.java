import java.util.Scanner;

public class atividade07 {




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] nomes = new String[15];


        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º nome: ");
            nomes[i] = scanner.nextLine();
        }


        System.out.println("\nNomes na ordem inversa:");
        for (int i = nomes.length - 1; i >= 0; i--) {
            System.out.println("Posição " + i + ": " + nomes[i]);
        }

        scanner.close();
    }
}
