package by.bsuir.german;

abstract class Product {
    private String title;
    private double wight;
    private double price;
    private Metal metal;


    public Product(String title, double wight, double price, Metal metal) {
        this.title = title;
        this.wight = wight;
        this.price = price;
        this.metal = metal;
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
