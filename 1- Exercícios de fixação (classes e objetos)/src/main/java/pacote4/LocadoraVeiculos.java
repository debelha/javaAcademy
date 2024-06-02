package pacote4;
import java.util.Scanner;

public class LocadoraVeiculos {

    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Moto moto1 = new Moto();
        Moto moto2 = new Moto();

        Scanner leitura = new Scanner(System.in);

        System.out.println("Insira a marca do veículo: ");
        String marca = leitura.nextLine();

        System.out.println("Insira o modelo do veículo: ");
        String modelo = leitura.nextLine();

        System.out.println("Insira as cilindradas do veículo: ");
        String cilindradas = leitura.nextLine();

        System.out.println("A marca do veículo é: " + marca);
        System.out.println("O modelo do veículo é: " + modelo);
        System.out.println("Quantidade de cilindradas: " + marca);

    }
}
