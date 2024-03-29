package TestClass;

import Class.*;

public class Library {
    public static void main(String[] args) {
        Author monteiro = new Author(
                "Monteiro Lobato",
                "monteiro@email.com",
                'M');

        Author lobato = new Author(
                "Monteiro",
                "monteiro@email.com",
                'M');

        Book book = new Book(
                "Pica-Pau Amarelo",
                monteiro,
                9.99);

        Book book2 = new Book(
                "Pica-Pau",
                monteiro,
                10.9,
                19);

        System.out.println(monteiro.toString());
        System.out.println(book.toString());
    }
}
