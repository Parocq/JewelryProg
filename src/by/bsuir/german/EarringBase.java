package by.bsuir.german;

public class EarringBase extends Product {
    boolean paired;

    public EarringBase(String title, double weight, double price, Metal metal, boolean paired) {
        super(title, weight, price, metal);
        this.paired = paired;
    }
}
