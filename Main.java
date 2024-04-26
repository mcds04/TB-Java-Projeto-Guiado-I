public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        estoque.adicionarProduto("Caneta Preta", 10, 9.99);
        estoque.adicionarProduto("Caderno 12 Materias", 5, 19.99);
        estoque.adicionarProduto("Agenda Unicornio", 3, 29.99);
        estoque.adicionarProduto("Mochila Unisex", 5, 89.90);
        estoque.adicionarProduto("Lapiseira Rosa", 10, 8.80);

        estoque.listarProdutos();

        estoque.imprimirProduto("Produto1");
        estoque.imprimirProduto("Produto2");
        estoque.imprimirProduto("Produto3");
        estoque.imprimirProduto("Produto4");
        estoque.imprimirProduto("Produto5");
    }
}