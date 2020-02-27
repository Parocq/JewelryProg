package by.bsuir.german.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Adornment implements  Serializable{

    private String title;
    private int type;
    private RingBase ring;
    private NecklaceBase necklace;
    private EarringBase earring;
    private List<Stone> usedStones;

    public Adornment(String title, int type, RingBase ring, List<Stone> usedStones) {
        this.title = title;
        this.type = type;
        this.ring = ring;
        this.usedStones = new ArrayList<>(usedStones);
    }

    public Adornment(String title, int type, NecklaceBase necklace, List<Stone> usedStones) {
        this.title = title;
        this.type = type;
        this.necklace = necklace;
        this.usedStones = new ArrayList<>(usedStones);
    }

    public Adornment(String title, int type, EarringBase earring, List<Stone> usedStones) {
        this.title = title;
        this.type = type;
        this.earring = earring;
        this.usedStones = new ArrayList<>(usedStones);
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
