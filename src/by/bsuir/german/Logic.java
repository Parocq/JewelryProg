package by.bsuir.german;

import by.bsuir.german.comporator.*;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

public class Logic {

    Storage storage = new Storage();

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
        List<Stone> list = new ArrayList<>();
        list = storage.getAdornments().get(number).getUsedStones();
        for (int i = 0; i < list.size(); i++) {
            sum += storage.getAdornments().get(number).getUsedStones().get(i).getWeight();
        }
        return sum;
    }

    double calculatePrice (int number) {
        double sum=0;
        List<Stone> list = new ArrayList<>();
        list = storage.getAdornments().get(number).getUsedStones();
        for (int i = 0; i < list.size(); i++) {
            sum += storage.getAdornments().get(number).getUsedStones().get(i).getPrice();
        }
        return sum;
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
