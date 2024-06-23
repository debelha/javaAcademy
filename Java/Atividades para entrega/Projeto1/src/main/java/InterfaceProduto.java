public interface InterfaceProduto {

        String getTipo();
        String getNome();
        double getPreco();
        void setNome(String nome);
        void setPreco(double preco);
        void setQuantidade(int quantidade);
        int getQuantidade();
        String exibirDetalhes();
    }

