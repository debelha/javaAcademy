public class Main {
    public static void main(String[] args) {
        try {
            CarrinhoDeCompras carrinho1 = new CarrinhoDeCompras();
            CarrinhoDeCompras carrinho2 = new CarrinhoDeCompras();

            Eletronico eletronico = new Eletronico("Smartphone", 2999.0, 24, 3);
            Roupa roupa = new Roupa("T-Shirt", 89.99, "M", "Branca", 6);
            Alimento alimento = new Alimento("Arroz", 9.99, "2024-12-31", 4);

            carrinho1.adicionarItem(eletronico);
            carrinho1.adicionarItem(roupa);
            carrinho1.adicionarItem(alimento);

            carrinho2.adicionarItem(new Eletronico("Notebook", 4999.0, 36, 2));
            carrinho2.adicionarItem(new Roupa("Calça Jeans", 149.99, "G", "Azul", 3));

            System.out.println("Carrinho 1:");
            carrinho1.listarItens();
            System.out.printf("Total: %.2f\n", carrinho1.calcularTotal());
            carrinho1.gerarArquivoTexto("carrinho1.txt");

            System.out.println("\nCarrinho 2:");
            carrinho2.listarItens();
            System.out.printf("Total: %.2f\n", carrinho2.calcularTotal());
            carrinho2.gerarArquivoTexto("carrinho2.txt");
        } catch (CarrinhoException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
