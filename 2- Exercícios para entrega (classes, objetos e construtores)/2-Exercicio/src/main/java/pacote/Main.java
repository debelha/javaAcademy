package pacote;
import java.util.Scanner;

/*
Objetivo: Criar um sistema de gerenciamento de alunos que permita adicionar alunos a uma
turma e listar todos os alunos de uma turma.

Descrição:
Você foi solicitado a desenvolver um sistema de gerenciamento para uma escola. O sistema deve
gerenciar informações sobre alunos e turmas, permitindo que novos alunos sejam adicionados a
uma turma específica e que todos os alunos dessa turma sejam listados. As informações a serem
mantidas dos alunos são: (nome, idade, e matrícula). Já para as turmas as informações são
(nome, código).

Aluno (“Lucas”, 22, 1234)
Turma(“Turma A”, 1A)
*/

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Aluno[] alunos = new Aluno[5];
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Escreva o nome do aluno " + (i + 1) + ":");
            String nome = sc.nextLine();

            System.out.println("Informe a idade do aluno " + (i + 1) + ":");
            int idade = Integer.parseInt(sc.nextLine());

            System.out.println("Informe a matricula do aluno " + (i + 1) + ":");
            int matricula = Integer.parseInt(sc.nextLine());
            sc.nextLine();

            alunos[i] = new Aluno(nome, idade, matricula);
        }

        System.out.println("Informe o nome da primeira turma: ");
        String nomeTurmaA = sc.nextLine();

        System.out.println("Informe o codigo da primeira turma: ");
        String codigoTurmaA = sc.nextLine();

        Turma turmaA = new Turma(nomeTurmaA, codigoTurmaA);

        System.out.println("Informe o nome da segunda turma: ");
        String nomeTurmaB = sc.nextLine();

        System.out.println("Informe o código da segunda turma:");
        String codigoTurmaB = sc.nextLine();

        Turma turmaB = new Turma(nomeTurmaB, codigoTurmaB);

        for (Aluno aluno : alunos) {
            turmaA.adicionarAluno(aluno);
            turmaB.adicionarAluno(aluno);
        }

        System.out.println("Alunos na " + turmaA.getNome() + ":");
        turmaA.listarAlunos();

        System.out.println("Alunos na " + turmaB.getNome() + ":");
        turmaB.listarAlunos();

        sc.close();
    }
}
