package by.bsuir.german;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    private static List<Stone> stones =  new ArrayList<>();
    private static List<Metal> metals = new ArrayList<>();
    private static List<Adornment> adornments = new ArrayList<>();
    private static List<RingBase> ringBases = new ArrayList<>();
    private static List<NecklaceBase> necklaceBases = new ArrayList<>();
    private static List<EarringBase> earringBases = new ArrayList<>();

    public Storage() {
    }

    public List<Stone> getStones() {
        return stones;
    }

    public List<Metal> getMetals() {
        return metals;
    }

    public List<Adornment> getAdornments() {
        return adornments;
    }

    public List<RingBase> getRingBases() {
        return ringBases;
    }

    public List<NecklaceBase> getNecklaceBases() {
        return necklaceBases;
    }

    public List<EarringBase> getEarringBases() {
        return earringBases;
    }

    public  void addRingBaseOnStock (RingBase ringBase){
        ringBases.add(ringBase) ;
    }

    public  void addNecklaceBaseOnStock (NecklaceBase necklaceBase){
        necklaceBases.add(necklaceBase);
    }

    public  void addEarringBaseOnStock (EarringBase earringBase){
        earringBases.add(earringBase);
    }

    public  void addStoneOnStock (Stone stone){
        stones.add(stone);
    }

    public  void addMetalOnStock (Metal metal){
        metals.add(metal);
    }

    public  void addAdornmentOnStock (Adornment adornment){
        adornments.add(adornment);
    }


    void selectTitles (List<?> objects){
        for (int i = 0; i < objects.size(); i++) {
            System.out.print(i + 1+".");
            if (objects.get(i) instanceof Product){
                System.out.print(((Product)objects.get(i)).getTitle() + "  ");
            } else if (objects.get(i) instanceof Material){
                System.out.print(((Material)objects.get(i)).getTitle() + "  ");
            } else if (objects.get(i) instanceof Adornment){
                System.out.print(((Adornment)objects.get(i)).getTitle() + "  ");
            }
            if (i == 5) System.out.println();
        }
        System.out.println();
    }


    void printAll (){
        System.out.println("-------------Металлы, хранящиеся на складе:");
        selectTitles(metals);
        System.out.println("-------------Камни, хранящиеся на складе:");
        selectTitles(stones);
        System.out.println("-------------Основы для колец, хранящиеся на складе:");
        selectTitles(ringBases);
        System.out.println("-------------Основы для ожерелий, хранящиеся на складе:");
        selectTitles(necklaceBases);
        System.out.println("-------------Основы для серег, хранящиеся на складе:");
        selectTitles(earringBases);
        System.out.println("-------------Украшения, хранящиеся на складе:");
        selectTitles(adornments);
    }
}
