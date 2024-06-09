package pacote1;

/*
Objetivo: Desenvolver um software básico de biblioteca que permita gerenciar livros,
adicionando-os e listando-os.

Descrição:
Você foi contratado para desenvolver um sistema básico para uma biblioteca. O sistema deve ser
capaz de gerenciar informações sobre livros e permitir que novos livros sejam adicionados à
biblioteca e que todos os livros presentes na biblioteca sejam listados. As informações a serem
mantidas sobre livros são: (título, autor, ano de publicação). O bibliotecário deseja obter as
informações de todos os livros cadastrados na biblioteca.
 */

public class Main {

    public static void main(String[] args) {

        Livro livro1 = new Livro("Game of Thrones", "George R. R. Martin", 1996);
        Livro livro2 = new Livro("O Caçador de Pipas", "Khaled Hosseini",2003);
        Livro livro3 = new Livro("Marley & Eu", "John Grogan", 2005);

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        biblioteca.listarLivros();
    }
}
