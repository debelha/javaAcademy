import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<InterfaceProduto> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(InterfaceProduto produto) throws CarrinhoException {
        if (produto == null) {
            throw new CarrinhoException("O produto não pode ser nulo.");
        }
        itens.add(produto);
    }

    public void removerItem(InterfaceProduto produto) throws CarrinhoException {
        boolean removed = itens.removeIf(item -> item.getNome().equals(produto.getNome()) && item.getQuantidade() == produto.getQuantidade());
        if (!removed) {
            throw new CarrinhoException("Produto não encontrado no carrinho.");
        }
    }

    public void listarItens() {
        for (InterfaceProduto produto : itens) {
            System.out.println(produto.exibirDetalhes());
        }
    }

    public List<InterfaceProduto> exportarListaProdutos() {
        return new ArrayList<>(itens);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (InterfaceProduto produto : itens) {
            total += produto.getPreco() * produto.getQuantidade();
        }
        return total;
    }

    public void gerarArquivoTexto(String nomeArquivo) throws CarrinhoException {
        // Se o nome do arquivo não contém um caminho absoluto, adicione a raiz do projeto.
        File arquivo = new File(nomeArquivo);
        if (!arquivo.isAbsolute()) {
            String raizDoProjeto = System.getProperty("user.dir");
            arquivo = new File(raizDoProjeto, nomeArquivo);
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo))) {
            writer.write("item: Qtd: Nome: Preço: SubTotal:\n");
            int itemNum = 1;
            for (InterfaceProduto produto : itens) {
                double subTotal = produto.getPreco() * produto.getQuantidade();
                writer.write(String.format("%d %d %s %.2f %.2f\n", itemNum, produto.getQuantidade(), produto.getNome(), produto.getPreco(), subTotal));
                itemNum++;
            }
            writer.write(String.format("Total: %.2f\n", calcularTotal()));
        } catch (IOException e) {
            throw new CarrinhoException("Erro ao gerar o arquivo de texto.", e);
        }
    }
}
