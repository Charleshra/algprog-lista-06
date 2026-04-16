import java.util.Scanner;

public class ConsoantesVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] vetor = new char[10];
        int contador = 0;

        System.out.println("Digite 10 caracteres:");

        // Leitura dos caracteres
        for (int i = 0; i < 10; i++) {
            vetor[i] = sc.next().toLowerCase().charAt(0);
        }

        System.out.println("\nConsoantes encontradas:");

        // Verificação das consoantes
        for (int i = 0; i < 10; i++) {
            if (Character.isLetter(vetor[i]) && 
               vetor[i] != 'a' && vetor[i] != 'e' && vetor[i] != 'i' && 
               vetor[i] != 'o' && vetor[i] != 'u') {
                
                System.out.print(vetor[i] + " ");
                contador++;
            }
        }

        System.out.println("\nQuantidade de consoantes: " + contador);

        sc.close();
    }
}