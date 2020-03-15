package Desafio_Livraria;

import java.util.ArrayList;

public class BookManager {

    private ArrayList<Book> stockBook = new ArrayList<>();
    private ArrayList<Collection> stockCollection = new ArrayList<>();

    public ArrayList<Book> getStockBook() {
        return stockBook;
    }

    public ArrayList<Collection> getStockCollection() {
        return stockCollection;
    }

    public void setStockCollection(ArrayList<Collection> stockCollection) {
        this.stockCollection = stockCollection;
    }

    public void insertBook(Book book){
        this.stockBook.add(book);
    }

    public void insertCollection(Collection collection){
        this.stockCollection.add(collection);
    };

    public String queryCollection(Collection collection){
        System.out.println("------------Procurando Coleções------------------");
        for (Collection index: this.stockCollection) {
            if (index.getId() == collection.getId()){
                ArrayList data = new ArrayList();
                data.add(index.getTitles());
                data.add(index.getId());
                data.add(index.getPrice());
                data.add(index.getDescription());
                String returningString = "Collection Id: "+data.get(1)+"\nCollection Description: "+data.get(3)+
                "\nCollection Books Titles: "+data.get(0)+"\nCollection Price: "+data.get(2);
                return returningString;
            }
        }
        return "Coleção Não Encontrada";


    };

    public String queryBook(Book book) {
        System.out.println("-----------Procurando livro---------------");
        for (Book index : this.stockBook) {
            if (index.getId() == book.getId()) {
                ArrayList <String> data = new ArrayList<>();
                data.add(index.getId());
                data.add(index.getTitle());
                data.add(index.getAuthor());
                data.add(index.getIsbn());
                data.add(String.valueOf(index.getQtdStock()));
                data.add(String.valueOf(index.getPrice()));
                String returningString = "Book Code: "+data.get(0)+"\nBook Title: "+data.get(1)+"\nBook Author: "+
                       data.get(2)+"\nBook ISBN: "+data.get(3)+"\nBooks Available: "+data.get(4)+"\nBook Price: R$"+data.get(5);
                return returningString;
            }
        }
        return "Livro Não Encontrado";

    };


    public String sellBook(Book book){
        for (Integer index = 0; index < this.stockBook.size(); index++ ) {
            if (book == this.stockBook.get(index)) {
                Integer qtd = this.stockBook.get(index).getQtdStock();
                --qtd;
                this.stockBook.get(index).setQtdStock(qtd);
                return "Venda Feita !";
            }
        }
        return "Estoque Esgotado";
        }

}



