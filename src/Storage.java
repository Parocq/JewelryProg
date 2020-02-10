import java.util.ArrayList;

public class Storage {

    static ArrayList<Stone> stones;
    static ArrayList<Metal> metals;
//    private ArrayList<Product> products;
    static ArrayList<Adornment> adornments; ///////////////связано с Logic. Правильно ли длавать такие модификаторы доступа?
    static ArrayList<RingBase> ringBases;//////////////////убраны private
    static ArrayList<NecklaceBase> necklaceBases;
    static ArrayList<EarringBase> earringBases;

    public Storage() {
    }

    public static void addRingBaseOnStock (RingBase ringBase){
        ringBases.add(ringBase) ;
    }

    public static void addNecklaceBaseOnStock (NecklaceBase necklaceBase){
        necklaceBases.add(necklaceBase);
    }

    public static void addEarringBaseOnStock (EarringBase earringBase){
        earringBases.add(earringBase);
    }

    public static void addStoneOnStock (Stone stone){
        stones.add(stone);
    }

    public static void addMetalOnStock (Metal metal){
        metals.add(metal);
    }

    public static void addAdornmentOnStock (Adornment adornment){
        adornments.add(adornment);
    }
}
