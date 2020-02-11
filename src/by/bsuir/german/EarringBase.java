package by.bsuir.german;

public class EarringBase extends Product {
    boolean paired;

    public EarringBase(String title, double wight, double price, Metal metal, boolean paired) {
        super(title, wight, price, metal);
        this.paired = paired;
    }
}
