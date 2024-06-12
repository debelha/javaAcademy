package CopiarObjeto;

import org.w3c.dom.ls.LSOutput;

public class Carro {
    public String nomeCarro;
    public int anoCarro;
    public String fabricanteCarro;

    public Carro(String nomeCarro, int anoCarro, String fabricanteCarro) {
        this.nomeCarro = nomeCarro;
        this.anoCarro = anoCarro;
        this.fabricanteCarro = fabricanteCarro;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nomeCarro='" + nomeCarro + '\'' +
                ", anoCarro=" + anoCarro +
                ", fabricanteCarro='" + fabricanteCarro + '\'' +
                '}';
    }

    public Carro() {

    }
}


