public class Product {
    private String type;
    private String title;
    private String author;
    private double price;

    public Product(String type, String title, String author, double price) {
        this.type = type;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
}
