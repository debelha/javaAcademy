package pacote2;

public class Disciplina {

    public static void main(String[] args) {

        Professor professor = new Professor();
        Laboratorio laboratorio = new Laboratorio();

        professor.nome = "Deborah Leite";
        laboratorio.local = "Laboratorio 1";

        System.out.println("O nome do professor é: " + professor.nome);
        System.out.println("O local da aula é no: " + laboratorio.local);
    }
}
