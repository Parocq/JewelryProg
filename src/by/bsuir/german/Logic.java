package by.bsuir.german;

import by.bsuir.german.comporator.*;
//import by.bsuir.german.comporator.EaringBaseTitleComparator;

import java.util.Collections;
import java.util.List;

public class Logic {

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
    }
    void sortNecklaceBaseByTitle (List<NecklaceBase> list){
        Collections.sort(list, new NecklaceBaseTitleComparator());
    }
    void sortAdornmentByTitle (List<Adornment> list){
        Collections.sort(list, new AdormentTitleComparator());
    }

}
