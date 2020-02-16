package by.bsuir.german;

import java.util.ArrayList;
import java.util.List;

public class Adornment {

    private String title;
    private int type;
    private RingBase ring;
    private NecklaceBase necklace;
    private EarringBase earring;
    private  List<Stone> usedStones = new ArrayList<>();

    private Menu menu = new Menu();

    public Adornment(RingBase ring) {this.ring = ring;}

    public Adornment(NecklaceBase necklace){
        this.necklace = necklace;
    }

    public Adornment(EarringBase earring){
        this.earring = earring;
    }

    public Adornment() {
    }

    public Adornment(String title, int type, RingBase ring) {
        this.title = title;
        this.type = type;
        this.ring = ring;
        usedStones = menu.getStonesToUse();
    }

    public Adornment(String title, int type, NecklaceBase necklace) {
        this.title = title;
        this.type = type;
        this.necklace = necklace;
        usedStones = menu.getStonesToUse();
    }

    public Adornment(String title, int type, EarringBase earring) {
        this.title = title;
        this.type = type;
        this.earring = earring;
        usedStones = menu.getStonesToUse();
    }

    public String getTitle() {
        return title;
    }

    public int getType() {
        return type;
    }

    public RingBase getRing() {
        return ring;
    }

    public NecklaceBase getNecklace() {
        return necklace;
    }

    public EarringBase getEarring() {
        return earring;
    }

    public List<Stone> getUsedStones() {
        return usedStones;
    }
}
