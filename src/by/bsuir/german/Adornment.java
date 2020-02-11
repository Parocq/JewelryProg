package by.bsuir.german;

import java.util.ArrayList;

public class Adornment {

    String title;
    int type;
    RingBase ring;
    NecklaceBase necklace;
    EarringBase earring;
    ArrayList<Stone> usedStones;

    public Adornment(RingBase ring) {this.ring = ring;}

    public Adornment(NecklaceBase necklace){
        this.necklace = necklace;
    }

    public Adornment(EarringBase earring){
        this.earring = earring;
    }

    public Adornment() {
    }

    public Adornment(String title, int type, RingBase ring, ArrayList<Stone> usedStones) {
        this.title = title;
        this.type = type;
        this.ring = ring;
        this.usedStones = usedStones;
    }

    public Adornment(String title, int type, NecklaceBase necklace, ArrayList<Stone> usedStones) {
        this.title = title;
        this.type = type;
        this.necklace = necklace;
        this.usedStones = usedStones;
    }

    public Adornment(String title, int type, EarringBase earring, ArrayList<Stone> usedStones) {
        this.title = title;
        this.type = type;
        this.earring = earring;
        this.usedStones = usedStones;
    }

    public String getTitle() {
        return title;
    }
}
