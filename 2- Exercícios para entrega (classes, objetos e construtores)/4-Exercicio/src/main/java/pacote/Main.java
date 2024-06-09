package pacote;

/*
Você foi contratado para desenvolver uma aplicativo Java para uma empresa chamada
HealthCare. Esse software deverá ter uma classe chamada Paciente que possui um construtor
que recebe o seu peso em quilos e sua altura em metros, ambos utilizando o tipo double. Crie um
método chamado calcularIMC() que calcula o índice de Massa Corporal de acordo com a fórmula
IMC = peso (quilos) / (altura * altura (metros)). Crie também um método chamado diagnostico()
que utiliza o método calcularIMC() e retorna uma String de acordo com as seguintes faixas de
valor:

● Baixo peso muito grave = IMC abaixo de 16 kg/m2
● Baixo peso grave = IMC entre 16 e 16,99 kg/m2
● Baixo peso = IMC entre 17 e 18,49 kg/m2
● Peso normal = IMC entre 18,50 e 24,99 kg/m2
● Sobrepeso = IMC entre 25 e 29,99 kg/m2
● Obesidade grau I = IMC entre 30 e 34,99 kg/m2
● Obesidade grau II = IMC entre 35 e 39,99 kg/m2
● Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m2

Escreva uma classe chamada Principal em que se criam 3 instâncias da classe Paciente com
valores diferentes e se imprime no console o resultado dos dois métodos criados.

Bônus: Crie um atributo nome, para a classe paciente, e um método setNome(), para dar nome
aos pacientes. Após, escreva no console a mensagem configurada anteriormente junto ao nome
do paciente.
Ex.: O diagnóstico do pac. Lucas é Peso normal = IMC entre 18,50 e 24,99 kg/m2
 */


public class Main {

    public static void main(String[] args) {

        Paciente paciente1 = new Paciente(70, 1.75);
        Paciente paciente2 = new Paciente(69, 1.55);
        Paciente paciente3 = new Paciente(25, 1.20);

        paciente1.setNome("Deborah Leite");
        paciente2.setNome("Maria Aparecida");
        paciente3.setNome("Rihanna Fenty");

        System.out.println("O diagnóstico da paciente " + paciente1.getNome() + " é: "
                + paciente1.diagnostico() + " = IMC entre 18,50 e 24,99 kg/m²");
        System.out.println("O diagnóstico da paciente " + paciente2.getNome() + " é: "
                + paciente2.diagnostico() + " = IMC entre 25 e 29,99 kg/m²");
        System.out.println("O diagnóstico da paciente " + paciente3.getNome() + " é: "
                + paciente3.diagnostico() + " = IMC entre 30 e 34,99 kg/m²");

    }
}
