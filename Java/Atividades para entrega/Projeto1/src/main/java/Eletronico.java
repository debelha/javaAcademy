public class Eletronico extends ProdutoBase {
    private int garantiaMeses;

    public Eletronico(String nome, double preco, int garantiaMeses, int quantidade) {
        super(nome, preco, quantidade);
        this.garantiaMeses = garantiaMeses;
    }

    public Eletronico() {}

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public String getTipo() {
        return "Eletrônico";
    }

    @Override
    public String exibirDetalhes() {
        return String.format("Tipo: %s, Nome: %s, Preço: %.2f, Quantidade: %d, Garantia: %d meses",
                getTipo(), getNome(), getPreco(), getQuantidade(), garantiaMeses);
    }
}

