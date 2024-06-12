package CopiarObjeto;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro("Fusca", 1967, "VM");
        Carro carro2 = new Carro();

        System.out.println(carro1);
        System.out.println(carro2);
        carro2=carro1;
        System.out.println(carro2);
    }
}



