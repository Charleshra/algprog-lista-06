import java.util.Scanner;

public class VetorNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        // Leitura dos números
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        // Exibição dos números
        System.out.println("\nNúmeros digitados:");
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }

        sc.close();
    }
}