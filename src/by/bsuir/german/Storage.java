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

    public  void setStones(ArrayList<Stone> stones) {
        this.stones = stones;
    }

    public List<Metal> getMetals() {
        return metals;
    }

    public  void setMetals(ArrayList<Metal> metals) {
        this.metals = metals;
    }

    public List<Adornment> getAdornments() {
        return adornments;
    }

    public  void setAdornments(ArrayList<Adornment> adornments) {
        this.adornments = adornments;
    }

    public List<RingBase> getRingBases() {
        return ringBases;
    }

    public  void setRingBases(ArrayList<RingBase> ringBases) {
        this.ringBases = ringBases;
    }

    public List<NecklaceBase> getNecklaceBases() {
        return necklaceBases;
    }

    public  void setNecklaceBases(ArrayList<NecklaceBase> necklaceBases) {
        this.necklaceBases = necklaceBases;
    }

    public List<EarringBase> getEarringBases() {
        return earringBases;
    }

    public  void setEarringBases(ArrayList<EarringBase> earringBases) {
        this.earringBases = earringBases;
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

    public  void    addStoneOnStock (Stone stone){
        stones.add(stone);
    }

    public  void addMetalOnStock (Metal metal){
        metals.add(metal);
    }

    public  void addAdornmentOnStock (Adornment adornment){
        adornments.add(adornment);
    }

    void selectRingTitles(List<RingBase> ringBases) {///и вот эти выводы куда девать, тут или в Storage  всё же.
        String str = "";
        for (int i = 0; i < ringBases.size(); i++) {
            System.out.print(i + 1+".");
            str += ringBases.get(i).getTitle();
            if (i == 5) System.out.println();
        }
        System.out.println(str);
    }

    void selectNecklaceTitles(List<NecklaceBase> necklaceBases) {
        String str = "";
        for (int i = 0; i < necklaceBases.size(); i++) {
            System.out.print(i + 1+".");
            str += necklaceBases.get(i).getTitle();
            if (i == 5) System.out.println();
        }
        System.out.println(str);
    }

    void selectEarringTitles(List<EarringBase> earringBases) {
        String str = "";
        for (int i = 0; i < earringBases.size(); i++) {
            System.out.print(i + 1+".");
            str += earringBases.get(i).getTitle();
            if (i == 5) System.out.println();
        }
        System.out.println(str);
    }

    void selectStoneTitles (List<Stone> earringBases) {
        String str = "";
        for (int i = 0; i < stones.size(); i++) {
            System.out.print(i + 1+".");
            str += stones.get(i).getTitle();
            if (i == 5) System.out.println();
        }
        System.out.println(str);
    }

    void selectAdornmentTitles (List<Adornment> adornments){
        String str = "";
        for (int i = 0; i < adornments.size(); i++) {
            System.out.print(i + 1+".");
            str += adornments.get(i).getTitle();
            if (i == 5) System.out.println();
        }
        System.out.println(str);
    }

    void selectMetalsTitles (List<Metal> metals){
        String str = "";
        for (int i = 0; i < metals.size(); i++) {
            System.out.print(i + 1+".");
            str += metals.get(i).getTitle();
            if (i == 5) System.out.println();
        }
        System.out.println(str);
    }

    void printAll (){
        System.out.println("-------------Металлы, хранящиеся на складе:");
        selectMetalsTitles(metals);
        System.out.println("-------------Камни, хранящиеся на складе:");
        selectStoneTitles(stones);
        System.out.println("-------------Основы для колец, хранящиеся на складе:");
        selectRingTitles(ringBases);
        System.out.println("-------------Основы для ожерелий, хранящиеся на складе:");
        selectNecklaceTitles(necklaceBases);
        System.out.println("-------------Основы для серег, хранящиеся на складе:");
        selectEarringTitles(earringBases);
        System.out.println("-------------Украшения, хранящиеся на складе:");
        selectAdornmentTitles(adornments);
    }
}
