package Desafio_Livraria;

public class Book {
    private String id;
    private String title;
    private String author;
    private Integer releaseYear;
    private String isbn;
    private Integer qtdStock;
    private Double price;

    public Book(){};

    public Book(String id, String title, String author, Integer releaseYear, String isbn, Integer qtdStock, Double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
        this.isbn = isbn;
        this.qtdStock = qtdStock;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getQtdStock() {
        return qtdStock;
    }

    public void setQtdStock(Integer qtdStock) {
        this.qtdStock = qtdStock;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
