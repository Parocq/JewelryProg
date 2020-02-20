package by.bsuir.german.entity;

public class Metal extends Material {

    private double sample;

    public Metal(String title, double weight, double price, double sample) {
        super(title, weight, price);
        this.sample = sample;
    }
}
