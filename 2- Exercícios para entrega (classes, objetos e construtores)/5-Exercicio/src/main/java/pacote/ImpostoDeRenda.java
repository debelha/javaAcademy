package pacote;

public class ImpostoDeRenda {
    private Pessoa pessoa;

    public ImpostoDeRenda(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public double calcular(){
        double imposto = 0;
        int faixa = FaixaImpostoDeRenda.faixa(pessoa.salario);
        if(faixa == 1){
            imposto = 0;
        }
        else if(faixa == 2){
            imposto = pessoa.salario*0.075 - 158.4;
        }
        else if(faixa == 3){
            imposto = pessoa.salario*0.15 - 370.4;
        }
        else if(faixa == 4){
            imposto = pessoa.salario*0.225 - 651.73;
        }
        else{
            imposto = pessoa.salario*0.275 - 884.96;
        }
        return imposto;
    }

    public void imprimir(){
        double imposto = calcular();
        int faixa = FaixaImpostoDeRenda.faixa(pessoa.salario);
        System.out.println(String.format("%s seu salário é R$%.2f sua faixa de imposto é %d e o valor do imposto de renda a ser pago é: R$%.2f", pessoa.nome ,pessoa.salario, faixa, imposto));
    }
}

