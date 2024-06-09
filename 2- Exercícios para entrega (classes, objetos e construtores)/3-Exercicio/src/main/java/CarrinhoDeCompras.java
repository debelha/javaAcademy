import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Produto> produtos;

    public CarrinhoDeCompras() {
        produtos = new ArrayList<Produto>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void listarProdutos() {
        System.out.println(String.format("%-15s %-10s %-5s %-10s", "Nome", "Valor unidade", "Quantidade", "Sub total"));
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    public double getTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getSubTotal();
        }
        return total;
    }
}
