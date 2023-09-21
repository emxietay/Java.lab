package vn.funix.fx22541.lab12_3;

public class Book {
    private String name;
    private final Author[] authors;
    private double price;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthorNames() {
        StringBuilder authorNames = new StringBuilder();
        for (int i = 0; i < authors.length - 1; i++) {
            authorNames.append(authors[i].getName()).append(", ");
        }
        authorNames.append(authors[authors.length - 1].getName());
        return authorNames.toString();
    }
}