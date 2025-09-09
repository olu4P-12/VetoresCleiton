import java.util.Scanner;

public class atividade09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String[] modelos = new String[5];
        double[] consumo = new double[5];


        System.out.println("Digite os modelos dos 5 carros e seus consumos (km/l):");
        for (int i = 0; i < 5; i++) {
            System.out.print("Modelo do carro " + (i+1) + ": ");
            modelos[i] = sc.nextLine();

            System.out.print("Consumo do " + modelos[i] + " (km/l): ");
            consumo[i] = sc.nextDouble();
            sc.nextLine();
        }


        int indiceMaisEconomico = 0;
        for (int i = 1; i < 5; i++) {
            if (consumo[i] > consumo[indiceMaisEconomico]) {
                indiceMaisEconomico = i;
            }
        }


        double[] litrosNecessarios = new double[5];
        for (int i = 0; i < 5; i++) {
            litrosNecessarios[i] = 1000 / consumo[i];
        }


        System.out.println("\n=== Resultados ===");
        System.out.println("Carro mais econômico: " + modelos[indiceMaisEconomico] +
                " (" + consumo[indiceMaisEconomico] + " km/l)");

        System.out.println("\nLitros necessários para percorrer 1000 km:");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%s: %.2f litros\n", modelos[i], litrosNecessarios[i]);
        }

        sc.close();
    }
}
