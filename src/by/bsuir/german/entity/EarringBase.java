package by.bsuir.german.entity;

public class EarringBase extends Product {
    private boolean paired;

    public EarringBase(String title, double weight, double price, Metal metal, boolean paired) {
        super(title, weight, price, metal);
        this.paired = paired;
    }
}
