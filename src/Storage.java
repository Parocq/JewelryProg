import java.util.ArrayList;

public class Storage {

    private ArrayList<Stone> stones;
    private ArrayList<Metal> metals;
    private ArrayList<Product> products;
    private ArrayList<Adornment> adornments;

    public Storage() {
        this.stones = new ArrayList<>();
        this.metals = new ArrayList<>();
        this.products = new ArrayList<>();
        this.adornments = new ArrayList<>();
    }

    public ArrayList<Stone> getStones() {
        return stones;
    }

    public void setStones(ArrayList<Stone> stones) {
        this.stones = stones;
    }

    public ArrayList<Metal> getMetals() {
        return metals;
    }

    public void setMetals(ArrayList<Metal> metals) {
        this.metals = metals;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Adornment> getAdornments() {
        return adornments;
    }

    public void setAdornments(ArrayList<Adornment> adornments) {
        this.adornments = adornments;
    }
}
