package Desafio_Livraria;

import java.util.ArrayList;

public class Collection {

    private ArrayList<Book> booksGroup;
    private String id;
    private Double price;
    private String description;

    public String getTitles(){
        String returningString="";
        for (Book index: this.booksGroup) {
            returningString +=index.getTitle()+"; ";
        }
        return returningString;
    }

    public ArrayList<Book> getBooksGroup() {
        return booksGroup;
    }

    public void setBooksGroup(ArrayList<Book> booksGroup) {
        this.booksGroup = booksGroup;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
