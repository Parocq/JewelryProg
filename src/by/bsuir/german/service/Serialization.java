package by.bsuir.german.service;

import by.bsuir.german.entity.*;

import java.io.*;
import java.util.List;

public class Serialization {
    
    private ObjectOutputStream oosStones, oosMetals, oosAdornments, oosRingBases, oosNecklaceBases, oosEarringBases;
    private ObjectInputStream oisStones,oisMetals,oisAdornments,oisRingBases,oisNecklaceBases,oisEarringBases;
    private Storage storage;

    public Serialization(ObjectOutputStream oosStones, ObjectInputStream oisStones,
                         ObjectOutputStream oooMetals, ObjectInputStream oisMetals,
                         ObjectOutputStream oooAdornments, ObjectInputStream oisAdornments,
                         ObjectOutputStream oooRingBases, ObjectInputStream oisRingBases,
                         ObjectOutputStream oooNecklaceBases, ObjectInputStream oisNecklaceBases,
                         ObjectOutputStream oooEarringBases, ObjectInputStream oisEarringBases, Storage storage) {
        this.oosStones = oosStones;
        this.oisStones = oisStones;
        this.oosMetals = oooMetals;
        this.oisMetals = oisMetals;
        this.oosAdornments = oooAdornments;
        this.oisAdornments = oisAdornments;
        this.oosRingBases = oooRingBases;
        this.oisRingBases = oisRingBases;
        this.oosNecklaceBases = oooNecklaceBases;
        this.oisNecklaceBases = oisNecklaceBases;
        this.oosEarringBases = oooEarringBases;
        this.oisEarringBases = oisEarringBases;
        this.storage = storage;
    }

    public void serializeStone(List<Stone> objects) throws IOException {
            oosStones.writeObject(objects);
            oosStones.flush();
            oosStones.close();
    }

    public void serializeMetal(List<Metal> objects) throws IOException {
        oosMetals.writeObject(objects);
        oosMetals.flush();
        oosMetals.close();
    }

    public void serializeAdornment(List<Adornment> objects) throws IOException {
        oosAdornments.writeObject(objects);
        oosAdornments.flush();
        oosAdornments.close();
    }

    public void serializeRingBase(List<RingBase> objects) throws IOException {
        oosRingBases.writeObject(objects);
        oosRingBases.flush();
        oosRingBases.close();
    }

    public void serializeNecklaceBase(List<NecklaceBase> objects) throws IOException {
        oosNecklaceBases.writeObject(objects);
        oosNecklaceBases.flush();
        oosNecklaceBases.close();
    }

    public void serializeEarringBase(List<EarringBase> objects) throws IOException {
        oosEarringBases.writeObject(objects);
        oosEarringBases.flush();
        oosEarringBases.close();
    }


    public void desirealizeStoneList () throws IOException, ClassNotFoundException {
        List<Stone> stones = (List<Stone>)oisStones.readObject();
        for (int i = 0;i<stones.size();i++){
            storage.addStoneOnStock(stones.get(i));
        }
    }
    public void desirealizeMetalList () throws IOException, ClassNotFoundException {
        List<Metal> metals = (List<Metal>)oisMetals.readObject();
        for (int i = 0;i<metals.size();i++){
            storage.addMetalOnStock(metals.get(i));
        }
    }
    public void desirealizeAdornmentList () throws IOException, ClassNotFoundException {
        List<Adornment> adornments = (List<Adornment>)oisAdornments.readObject();
        for (int i = 0;i<adornments.size();i++){
            storage.addAdornmentOnStock(adornments.get(i));
        }
    }
    public void desirealizeRingBaseList () throws IOException, ClassNotFoundException {
        List<RingBase> ringBases = (List<RingBase>)oisRingBases.readObject();
        for (int i = 0;i<ringBases.size();i++){
            storage.addRingBaseOnStock(ringBases.get(i));
        }
    }
    public void desirealizeNecklaceBaseList () throws IOException, ClassNotFoundException {
        List<NecklaceBase> necklaceBases = (List<NecklaceBase>)oisNecklaceBases.readObject();
        for (int i = 0;i<necklaceBases.size();i++){
            storage.addNecklaceBaseOnStock(necklaceBases.get(i));
        }
    }
    public void desirealizeEarringBaseList () throws IOException, ClassNotFoundException {
        List<EarringBase> earringBases = (List<EarringBase>)oisEarringBases.readObject();
        for (int i = 0;i<earringBases.size();i++){
            storage.addEarringBaseOnStock(earringBases.get(i));
        }
    }


}
