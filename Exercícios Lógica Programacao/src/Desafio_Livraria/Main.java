package Desafio_Livraria;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Book bookA = new Book();
        Book bookB = new Book();
        Book bookC = new Book();
        Book bookD = new Book();

        bookA.setQtdStock(5);
        bookA.setAuthor("Thiago Nigro");
        bookA.setId("001");
        bookA.setIsbn("9788595083271");
        bookA.setPrice(21.90);
        bookA.setReleaseYear(2018);
        bookA.setTitle("Do Mil ao Milhão: Sem cortar o cafézinho");

        bookB.setQtdStock(2);
        bookB.setAuthor("Napoleon Hill");
        bookB.setId("002");
        bookB.setIsbn("9788568014004");
        bookB.setPrice(20.05);
        bookB.setReleaseYear(2011);
        bookB.setTitle("Mais esperto que o Diabo: O mistério revelado da liberdade e do sucesso.");

        bookC.setQtdStock(1);
        bookC.setAuthor("Gilberto Freyre");
        bookC.setId("003");
        bookC.setIsbn("9788526008694");
        bookC.setPrice(130.00);
        bookC.setReleaseYear(1933);
        bookC.setTitle("Casa Grande & Senzala");

        bookD.setQtdStock(3);
        bookD.setAuthor("Osho");
        bookD.setId("004");
        bookD.setIsbn("9788576849445");
        bookD.setPrice(130.00);
        bookD.setReleaseYear(2015);
        bookD.setTitle("O Livro do Ego");

        Book bookCollectionA = new Book();
        Book bookCollectionB = new Book();
        Book bookCollectionC = new Book();
        Book bookCollectionD = new Book();

        bookCollectionA.setQtdStock(1);
        bookCollectionA.setAuthor("Napoleon Hill");
        bookCollectionA.setId("005");
        bookCollectionA.setIsbn("9788503012690");
        bookCollectionA.setPrice(36.48);
        bookCollectionA.setReleaseYear(1928);
        bookCollectionA.setTitle("A Lei do Triunfo");

        bookCollectionB.setQtdStock(1);
        bookCollectionB.setAuthor("Napoleon Hill");
        bookCollectionB.setId("006");
        bookCollectionB.setIsbn("9788562409967");
        bookCollectionB.setPrice(24.89);
        bookCollectionB.setReleaseYear(2017);
        bookCollectionB.setTitle("As 16 Leis do Sucesso");

        bookCollectionC.setQtdStock(1);
        bookCollectionC.setAuthor("Napoleon Hill");
        bookCollectionC.setId("007");
        bookCollectionC.setIsbn("9788576766308");
        bookCollectionC.setPrice(28.00);
        bookCollectionC.setReleaseYear(1937);
        bookCollectionC.setTitle("Quem pensa enriquece");

        bookCollectionD.setQtdStock(1);
        bookCollectionD.setAuthor("Napoleon Hill");
        bookCollectionD.setId("008");
        bookCollectionD.setIsbn("9788539507924");
        bookCollectionD.setPrice(38.72);
        bookCollectionD.setReleaseYear(2014);
        bookCollectionD.setTitle("Só é pobre quem quer!");

        ArrayList<Book> stock = new ArrayList<>();
        stock.add(bookA);
        stock.add(bookB);
        stock.add(bookC);
        stock.add(bookD);

        ArrayList<Book> packNapoleonHill = new ArrayList<>();
        packNapoleonHill.add(bookCollectionA);
        packNapoleonHill.add(bookCollectionB);
        packNapoleonHill.add(bookCollectionC);
        packNapoleonHill.add(bookCollectionD);

        Collection colecaoNapHill = new Collection();
        colecaoNapHill.setBooksGroup(packNapoleonHill);
        colecaoNapHill.setDescription("Pacote 4 livros do Napoleon Hill");
        colecaoNapHill.setId("001");
        colecaoNapHill.setPrice(100.00);

        ArrayList<Collection> stockCollections = new ArrayList<>();
        stockCollections.add(colecaoNapHill);

        BookManager manager = new BookManager();
        manager.setStockCollection(stockCollections);
        manager.insertBook(bookA);
        manager.insertBook(bookB);
        System.out.println(manager.queryBook(bookB));
        manager.sellBook(bookB);
        System.out.println(manager.queryBook(bookD));
        manager.sellBook(bookA);
        System.out.println(manager.queryBook(bookA));
        System.out.println(manager.queryCollection(colecaoNapHill));
    }
}
