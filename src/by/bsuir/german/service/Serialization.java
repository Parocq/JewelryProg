package by.bsuir.german.service;

import by.bsuir.german.entity.Adornment;
import by.bsuir.german.entity.Material;
import by.bsuir.german.entity.Product;
import by.bsuir.german.entity.Stone;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Serialization {
    
    ObjectOutputStream objectOutputStream;
    ObjectInputStream objectInputStream;

    public Serialization(ObjectOutputStream objectOutputStream,ObjectInputStream objectInputStream) {
        this.objectOutputStream = objectOutputStream;
        this.objectInputStream = objectInputStream;
    }

    public void serializeArrayList (List<Stone> objects) throws IOException {
        objectOutputStream.writeObject(objects);
        objectOutputStream.flush();
        objectOutputStream.close();
    }

    public List<Stone> desirealizeArrayList () throws IOException, ClassNotFoundException {
//        List<Stone> stones = new ArrayList<>();
        List<Stone> stones = (List<Stone>)objectInputStream.readObject();
        return stones;
    }


}
