package by.bsuir.german.service;
import by.bsuir.german.comporator.*;
import by.bsuir.german.entity.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Logic {

    private Storage storage;

    public Logic(Storage storage) {
        this.storage = storage;
    }

    public void fillStorage (Storage st){
        List<Stone> stones = st.getStones();
        List<Metal> metals = st.getMetals();
        List<Adornment> adornments = st.getAdornments();
        List<RingBase> ringBases = st.getRingBases();
        List<NecklaceBase> necklaceBases = st.getNecklaceBases();
        List<EarringBase> earringBases = st.getEarringBases();

        for (int i = 0;i<stones.size();i++){
            storage.addStoneOnStock(stones.get(i));
        }
        for (int i = 0;i<metals.size();i++){
            storage.addMetalOnStock(metals.get(i));
        }
        for (int i = 0;i<adornments.size();i++){
            storage.addAdornmentOnStock(adornments.get(i));
        }
        for (int i = 0;i<ringBases.size();i++){
            storage.addRingBaseOnStock(ringBases.get(i));
        }
        for (int i = 0;i<necklaceBases.size();i++){
            storage.addNecklaceBaseOnStock(necklaceBases.get(i));
        }
        for (int i = 0;i<earringBases.size();i++){
            storage.addEarringBaseOnStock(earringBases.get(i));
        }
    }

    public void sortMetalByTitle (List<Metal> list){
        Collections.sort(list, new MetalTitleComparator());
    }
    public void sortStonesByTitle (List<Stone> list){
        Collections.sort(list, new StoneTitleComparator());
    }
    public void sortRingBaseByTitle (List<RingBase> list){
        Collections.sort(list, new RingBaseTitleComporator());
    }
    public void sortEarringBaseByTitle (List<EarringBase> list){ Collections.sort(list, new EarringBaseTitleComparator()); }
    public void sortNecklaceBaseByTitle (List<NecklaceBase> list){ Collections.sort(list, new NecklaceBaseTitleComparator());  }
    public void sortAdornmentByTitle (List<Adornment> list){
        Collections.sort(list, new AdormentTitleComparator());
    }
    public void sortStonesByPrice (List<Stone> list ){ Collections.sort(list, new StonePriceComporator());}

    public double calculateWeight (int number) {
        double sum=0;

        double weight = 0;
        if (storage.getAdornments().get(number).getEarring() != null){
            weight = storage.getAdornments().get(number).getEarring().getWeight();
        } else if (storage.getAdornments().get(number).getNecklace() != null){
            weight = storage.getAdornments().get(number).getNecklace().getWeight();
        } else weight += storage.getAdornments().get(number).getRing().getWeight();

        for (int i = 0; i < storage.getAdornments().get(number).getUsedStones().size(); i++) {
            sum += storage.getAdornments().get(number).getUsedStones().get(i).getWeight();
        }
        return sum+weight;
    }

    public double calculatePrice (int number) {
        double sum=0;

        double price = 0;
        if (storage.getAdornments().get(number).getEarring() != null){
            price = storage.getAdornments().get(number).getEarring().getWeight();
        } else if (storage.getAdornments().get(number).getNecklace() != null){
            price = storage.getAdornments().get(number).getNecklace().getWeight();
        } else price += storage.getAdornments().get(number).getRing().getWeight();

        for (int i = 0; i < storage.getAdornments().get(number).getUsedStones().size(); i++) {
            sum += storage.getAdornments().get(number).getUsedStones().get(i).getPrice();
        }
        return sum+price;
    }

    public List<Stone> searchForTransparence (double start, double finish){
        List<Stone> suit = new ArrayList<>();
        for (int i = 0; i<storage.getStones().size();i++){
            if (storage.getStones().get(i).getTransparence() >= start && storage.getStones().get(i).getTransparence() <= finish){
                suit.add(storage.getStones().get(i));
            }
        }
        return suit;
    }

}
