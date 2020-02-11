package by.bsuir.german;

public class Stone extends Material {

    private String color;
    private boolean stoneType;
    private double transparence;

    public Stone(String title, double weight, double price, String color, boolean stoneType, double transparence) {
        super(title, weight, price);
        this.color = color;
        this.stoneType = stoneType;
        this.transparence = transparence;
    }


    public String getColor() {
        return color;
    }

    public boolean isStoneType() {
        return stoneType;
    }

    public double getTransparence() {
        return transparence;
    }
}
