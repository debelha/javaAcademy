public class Main {

/*
Exercício 3: Sistema de Compras

Objetivo: Desenvolver um sistema de compras que permita adicionar produtos a um carrinho de
compras e listar todos os produtos no carrinho.

Descrição:
Você foi contratado para desenvolver um sistema básico de compras. O sistema deve gerenciar
informações sobre produtos e permitir que novos produtos sejam adicionados a um carrinho de
compras e que todos os produtos presentes no carrinho sejam listados. O aplicativo também
deverá ser capaz de informar o valor total dos produtos contidos no carrinho de compras.

Dica: Para formatar uma String para exibir valores

Considere as informações: nome, preço e quantidade para os produtos.
 */

    public static void main(String[] args) {

        Produto p1 = new Produto("Bolo de pote", 10.00, 4);
        Produto p2 = new Produto("Brigadeirão", 5.00, 2);
        Produto p3 = new Produto("Banoffe", 20.00, 1);


        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarProduto(p1);
        carrinho.adicionarProduto(p2);
        carrinho.adicionarProduto(p3);

        carrinho.listarProdutos();
        System.out.println("--------------------------------------------");
        System.out.printf("Total:                            R$ %.2f\n", carrinho.getTotal());
    }
}
