package pacote4;

public class Moto {

    public String marca;
    public String modelo;
    public String cilindradas;

    public void atribuirValores(String marcaMoto, String modeloMoto, String cilindradasMoto) {
        marca = marcaMoto;
        modelo = modeloMoto;
        cilindradas = cilindradasMoto;
    }

    public void retornarValores() {
        System.out.println("Informações sobre o veículo: " + marca + ", " + modelo + "," + cilindradas);
    }
}
