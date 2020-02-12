package by.bsuir.german;

import java.util.ArrayList;

public class Storage {

    private static ArrayList<Stone> stones =  new ArrayList<Stone>();
    private static ArrayList<Metal> metals = new ArrayList<Metal>();
    private static   ArrayList<Adornment> adornments = new ArrayList<Adornment>();
    private static ArrayList<RingBase> ringBases = new ArrayList<RingBase>();
    private static ArrayList<NecklaceBase> necklaceBases = new ArrayList<NecklaceBase>();
    private static ArrayList<EarringBase> earringBases = new ArrayList<EarringBase>();

    public Storage() {
    }

    public  ArrayList<Stone> getStones() {
        return stones;
    }

    public  void setStones(ArrayList<Stone> stones) {
        this.stones = stones;
    }

    public  ArrayList<Metal> getMetals() {
        return metals;
    }

    public  void setMetals(ArrayList<Metal> metals) {
        this.metals = metals;
    }

    public  ArrayList<Adornment> getAdornments() {
        return adornments;
    }

    public  void setAdornments(ArrayList<Adornment> adornments) {
        this.adornments = adornments;
    }

    public  ArrayList<RingBase> getRingBases() {
        return ringBases;
    }

    public  void setRingBases(ArrayList<RingBase> ringBases) {
        this.ringBases = ringBases;
    }

    public  ArrayList<NecklaceBase> getNecklaceBases() {
        return necklaceBases;
    }

    public  void setNecklaceBases(ArrayList<NecklaceBase> necklaceBases) {
        this.necklaceBases = necklaceBases;
    }

    public  ArrayList<EarringBase> getEarringBases() {
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

    public  void addStoneOnStock (Stone stone){
        stones.add(stone);
    }

    public  void addMetalOnStock (Metal metal){
        metals.add(metal);
    }

    public  void addAdornmentOnStock (Adornment adornment){
        adornments.add(adornment);
    }

    void selectRingTitles(ArrayList<RingBase> ringBases) {///и вот эти выводы куда девать, тут или в Storage  всё же.
        String str = "";
        for (int i = 0; i < ringBases.size(); i++) {
            System.out.print(i + 1+".");
            str += ringBases.get(i).getTitle();
            if (i == 5) System.out.println();
        }
        System.out.println(str);
    }

    void selectNecklaceTitles(ArrayList<NecklaceBase> necklaceBases) {
        String str = "";
        for (int i = 0; i < necklaceBases.size(); i++) {
            System.out.print(i + 1+".");
            str += necklaceBases.get(i).getTitle();
            if (i == 5) System.out.println();
        }
        System.out.println(str);
    }

    void selectEarringTitles(ArrayList<EarringBase> earringBases) {
        String str = "";
        for (int i = 0; i < earringBases.size(); i++) {
            System.out.print(i + 1+".");
            str += earringBases.get(i).getTitle();
            if (i == 5) System.out.println();
        }
        System.out.println(str);
    }

    void selectStoneTitles (ArrayList<Stone> earringBases) {
        String str = "";
        for (int i = 0; i < stones.size(); i++) {
            System.out.print(i + 1+".");
            str += stones.get(i).getTitle();
            if (i == 5) System.out.println();
        }
        System.out.println(str);
    }

    void selectAdornmentTitles (ArrayList<Adornment> adornments){
        String str = "";
        for (int i = 0; i < adornments.size(); i++) {
            System.out.print(i + 1+".");
            str += adornments.get(i).getTitle();
            if (i == 5) System.out.println();
        }
        System.out.println(str);
    }

    void selectMetalsTitles (ArrayList<Metal> metals){
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
