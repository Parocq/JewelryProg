import java.util.ArrayList;

public class Adornment {

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

    public Adornment(RingBase ring, ArrayList<Stone> usedStones) {
        this.ring = ring;
        this.usedStones = usedStones;
    }

    public Adornment(NecklaceBase necklace, ArrayList<Stone> usedStones) {
        this.necklace = necklace;
        this.usedStones = usedStones;
    }

    public Adornment(EarringBase earring, ArrayList<Stone> usedStones) {
        this.earring = earring;
        this.usedStones = usedStones;
    }
}
