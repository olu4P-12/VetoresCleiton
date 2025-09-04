import java.util.Scanner;

public class Atividade01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] numero = new int[6];

        numero [1] = 10;
        numero [2] = 20;
        numero [3] = 30;
        numero [4] = 40;
        numero [5] = 50;


        System.out.println("Escolha um numero de 1 a 5 ");
        int escolha = sc.nextInt();

        int i = 1;
        if (escolha >= 1 && escolha <= 5){
            System.out.println("O numero escolhido é: " + numero[escolha]);
        } else {
            System.out.println("Escolha invalida.");
        }


    }

}