public class Main {
    public static void main(String[] args) {

        Carro c = new Carro();
        c.modelo = "Fusca";
        c.fabricante = "VW";
        c.cor = "Azul";
        c.numeroRodas = 4;
        c.tipoPropulsao = "Térmica";
        System.out.println(c.getClass().getName()+": Modelo: "+c.modelo+"; Fabricante: "+c.fabricante+"; Cor: "+c.cor+" NumeroRodas: "+c.numeroRodas+"; TipoPropulsao: "+c.tipoPropulsao);

        Bicicleta b = new Bicicleta();
        b.modelo = "Cross";
        b.fabricante = "Gallo";
        b.cor = "Vermelha";
        b.numeroRodas = 2;
        b.tipoPropulsao = "Manual";
        System.out.println(b.getClass().getName()+": Modelo: "+b.modelo+"; Fabricante: "+b.fabricante+"; Cor: "+b.cor+" NumeroRodas: "+b.numeroRodas+"; TipoPropulsao: "+b.tipoPropulsao);
    }
}
