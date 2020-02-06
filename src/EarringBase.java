public class EarringBase extends Product {
    boolean paired;

    public EarringBase(String title, double wight, double price, boolean paired) {
        super(title, wight, price);
        this.paired = paired;
    }
}
