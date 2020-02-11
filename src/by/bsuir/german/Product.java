package by.bsuir.german;

abstract class Product {
    private String title;
    private double wight;
    private double price;

    public Product(String title, double wight, double price) {
        this.title = title;
        this.wight = wight;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getWight() {
        return wight;
    }

    public double getPrice() {
        return price;
    }
}
