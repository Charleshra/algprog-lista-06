import java.util.Scanner;

public class CalculoTinta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constantes
        final double ALTURA = 2.70;
        final double COBERTURA_TINTA = 10.0; // 1 litro cobre 10 m²
        final double DESCONTO = 0.10; // 10%

        // Entrada
        System.out.print("Informe o tamanho do lado do quarto (em metros): ");
        double lado = scanner.nextDouble();

        // Cálculo da área das paredes (4 paredes)
        double areaParedes = 4 * (lado * ALTURA);

        // Aplicando desconto de 10% (portas e janelas)
        double areaComDesconto = areaParedes * (1 - DESCONTO);

        // Cálculo da quantidade de tinta necessária
        double litrosTinta = areaComDesconto / COBERTURA_TINTA;

        // Saída
        System.out.println("\n=== RESULTADO ===");
        System.out.printf("Área total das paredes: %.2f m²\n", areaParedes);
        System.out.printf("Área com desconto: %.2f m²\n", areaComDesconto);
        System.out.printf("Litros de tinta necessários: %.2f litros\n", litrosTinta);

        scanner.close();
    }
}