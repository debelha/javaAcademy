public class Cachorro extends Animal {

    @Override
    public void fazerBarulho() {
        System.out.println("Au au");
    }

    //Sobrecarga @Overload
    public void andar(String andarComoCachorro) {
        System.out.println(andarComoCachorro);
    }

    //Sobrescrita @Override
    public void andar(){
        System.out.println("Cachorro andando");
    }
}
