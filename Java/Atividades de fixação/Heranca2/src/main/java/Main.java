public class Main {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Lucas", 30);
        Professor professor = new Professor("Professor Lucas", 30, 100000);
        pessoa.apresentarPessoa();
        professor.apresentarPessoa();
    }
}
