public class Pessoa {

    private String nome;
    private int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentarPessoa() {
        System.out.println("SUPER CLASSE - Nome: " + nome + "\nIdade: " + idade + "\n");
    }

    public Pessoa() {

    }
}


