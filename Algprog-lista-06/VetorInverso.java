import java.util.Scanner;

public class VetorInverso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numeros = new double[10];

        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextDouble();
        }

    
        System.out.println("\nNúmeros na ordem inversa:");
        for (int i = 9; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        sc.close();
    }
}