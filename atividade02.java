import java.util.Scanner;

public class atividade02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] operacao = new int[5];

        operacao [1] = 3;
        operacao [2] = 6;
        operacao [3] = 9;
        operacao [4] = 12;

        System.out.println("Escolha o Primeiro da Operação numero (1 a 4)");
        int escolha1 = sc.nextInt();
        System.out.println("Escolha o Segundo da Operação numero (1 a 4)");
        int escolha2 = sc.nextInt();


        if ((escolha1 >= 1 && escolha1 <= 4) && (escolha2 >= 1 && escolha2 <= 4)) {
            int resultado = operacao[escolha1] + operacao[escolha2];
            System.out.println("Resultado da soma: " + resultado);
        } else {
            System.out.println("Escolhas inválidas. Digite valores entre 1 e 4.");
        }


    }
}


