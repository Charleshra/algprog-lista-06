import java.util.Scanner;

public class ExemploSwitchCase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao;

        System.out.println("=== MENU ===");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Consultar");
        System.out.println("3 - Sair");
        System.out.print("Escolha uma opção: ");

        opcao = scanner.nextInt();

        switch (opcao) {

            case 1:
                System.out.println("Opção Cadastrar selecionada.");
                break;

            case 2:
                System.out.println("Opção Consultar selecionada.");
                break;

            case 3:
                System.out.println("Saindo do sistema...");
                break;

            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}