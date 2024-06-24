public class Main {

    public static void main(String[] args) {

        Gato gato = new Gato();
        gato.fazerBarulho();

        Cachorro cachorro = new Cachorro();
        cachorro.fazerBarulho();

        cachorro.andar();
        cachorro.andar("Cachorro andando diferente");
    }
}
