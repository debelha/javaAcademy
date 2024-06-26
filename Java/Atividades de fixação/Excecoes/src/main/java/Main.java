public class Main {

    public static void main(String[] args) throws Exception {
        a(10);
    }

    public static void a(int i) throws Exception {
        System.out.println("Iniciando execução de A");
        b(i);
        System.out.println("Terminando execução de A");
    }

    public static void b(int i) throws Exception {
        System.out.println("Iniciando execução de B");
        if(i==0)
            throw new Exception("Lançcando exceção em B");

        System.out.println("Terminando execução de B");
    }
}


