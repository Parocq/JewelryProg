package by.bsuir.german;

public class NecklaceBase extends Product{
    double length;

    public NecklaceBase(String title, double wight, double price, double length) {
        super(title, wight, price);
        this.length = length;
    }
}
