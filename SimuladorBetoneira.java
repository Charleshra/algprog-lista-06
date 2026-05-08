import java.util.Scanner;

public class SimuladorBetoneira {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double cimento, areia, brita, agua;
        double concreto;

        System.out.println("=== SIMULADOR DE BETONEIRA ===");

        // Entrada de dados
        System.out.print("Quantidade de cimento (kg): ");
        cimento = scanner.nextDouble();

        System.out.print("Quantidade de areia (kg): ");
        areia = scanner.nextDouble();

        System.out.print("Quantidade de brita (kg): ");
        brita = scanner.nextDouble();

        System.out.print("Quantidade de água (litros): ");
        agua = scanner.nextDouble();

        // Cálculo do concreto produzido
        concreto = cimento + areia + brita + agua;

        // Exibição dos resultados
        System.out.println("\n=== RESULTADO DA MISTURA ===");
        System.out.println("Cimento: " + cimento + " kg");
        System.out.println("Areia: " + areia + " kg");
        System.out.println("Brita: " + brita + " kg");
        System.out.println("Água: " + agua + " litros");

        System.out.println("\nQuantidade total da mistura: " 
                           + concreto + " kg/litros");

        // Verificação simples
        if (agua > cimento) {
            System.out.println("Mistura muito líquida!");
        } else {
            System.out.println("Mistura adequada para concreto.");
        }

        scanner.close();
    }
}