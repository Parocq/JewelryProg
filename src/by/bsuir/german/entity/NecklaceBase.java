package by.bsuir.german.entity;

public class NecklaceBase extends Product{
    private double length;

    public NecklaceBase(String title, double weight, double price, Metal metal, double length) {
        super(title, weight, price, metal);
        this.length = length;
    }
}
