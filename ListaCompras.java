import java.util.ArrayList;

public class ListaCompras {
    public static void main(String[] args) {

        // Criando a lista de compras
        ArrayList<String> produtos = new ArrayList<>();

        // Adicionando 5 produtos
        produtos.add("Arroz");
        produtos.add("Feijão");
        produtos.add("Leite");
        produtos.add("Macarrão");
        produtos.add("Café");

        // Mostrando os produtos cadastrados
        System.out.println("Lista de Compras:");
        for (String produto : produtos) {
            System.out.println("- " + produto);
        }

        // Mostrando a quantidade total de produtos
        System.out.println("\nQuantidade total de produtos: " + produtos.size());
    }
}