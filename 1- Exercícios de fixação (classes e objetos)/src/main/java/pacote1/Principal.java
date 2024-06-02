package pacote1;

public class Principal {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.idade = 18;

        Pessoa p2 = new Pessoa();
        p2.idade = 25;

        Pessoa p3 = new Pessoa();
        p3.idade = 23;

        System.out.println("A idade da Pessoa 1 é " + p1.idade);
        System.out.println("A idade da Pessoa 2 é " + p2.idade);
        System.out.println("A idade da Pessoa 3 é " + p3.idade);
    }
}
