package by.bsuir.german;

import by.bsuir.german.comporator.*;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

public class Logic {

    private Storage storage = new Storage();

    void sortMetalByTitle (List<Metal> list){
        Collections.sort(list, new MetalTitleComparator());
    }
    void sortStonesByTitle (List<Stone> list){
        Collections.sort(list, new StoneTitleComparator());
    }
    void sortRingBaseByTitle (List<RingBase> list){
        Collections.sort(list, new RingBaseTitleComporator());
    }
    void sortEarringBaseByTitle (List<EarringBase> list){
        Collections.sort(list, new EarringBaseTitleComparator());
    }    void sortNecklaceBaseByTitle (List<NecklaceBase> list){
        Collections.sort(list, new NecklaceBaseTitleComparator());
    }
    void sortAdornmentByTitle (List<Adornment> list){
        Collections.sort(list, new AdormentTitleComparator());
    }
    void sortStonesByPrice (List<Stone> list ){ Collections.sort(list, new StonePriceComporator());}

    double calculateWeight (int number) {
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

    double calculatePrice (int number) {
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

    List<Stone> searchForTransparence (double start, double finish){
        List<Stone> suit = new ArrayList<>();
        for (int i = 0; i<storage.getStones().size();i++){
            if (storage.getStones().get(i).getTransparence() >= start && storage.getStones().get(i).getTransparence() <= finish){
                suit.add(storage.getStones().get(i));
            }
        }
        return suit;
    }

}
