package pacote4;

public class Carro {

    private String fabricante;
    private String modelo;

    public void configurarDados(String fabricanteCarro, String modeloCarro) {
        fabricante = fabricanteCarro;
        modelo = modeloCarro;

    }

    public void exibirDados() {
        System.out.println("Informações sobre o carro: " + fabricante + " " + modelo);
    }

}
