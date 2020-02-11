package by.bsuir.german;

public class NecklaceBase extends Product{
    double length;

    public NecklaceBase(String title, double wight, double price, Metal metal, double length) {
        super(title, wight, price, metal);
        this.length = length;
    }
}
