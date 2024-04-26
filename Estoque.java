import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos;

    public Estoque() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(String nome, int quantidade, double preco) {
        Produto produto = new Produto(nome, quantidade, preco);
        produtos.add(produto);
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Não há produtos disponíveis.");
        } else {
            for (Produto produto : produtos) {
                System.out.println("Nome: " + produto.getNome());
                System.out.println("Quantidade: " + produto.getQuantidade());
                System.out.println("Preço: " + produto.getPreco());
                System.out.println("------------------------");
            }
        }
    }

    public void imprimirProduto(String nome) {
        boolean produtoEncontrado = false;

        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                System.out.println("Nome: " + produto.getNome());
                System.out.println("Quantidade: " + produto.getQuantidade());
                System.out.println("Preço: " + produto.getPreco());
                produtoEncontrado = true;
                break;
            }
        }

        if (!produtoEncontrado) {
            System.out.println("Produto não encontrado.");
        }
    }
}
