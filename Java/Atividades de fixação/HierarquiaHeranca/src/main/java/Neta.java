public class Neta extends Filha{

    public Neta (String mensagem) {
        //super(); A chamada é feita automaticamente pelo compilador
        System.out.println("Construtor da classe Neta: "+mensagem);
        //super(); Não é possível chamar o construtor da super classe aqui, a chamada deve ser a primeira coisa no construtor
    }
}

