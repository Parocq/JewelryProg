package by.bsuir.german.service;

import java.io.*;

public class Serialization {

    private ObjectOutputStream objectOutputStream;
    private ObjectInputStream objectInputStream;

    public Serialization(ObjectOutputStream objectOutputStream, ObjectInputStream objectInputStream){
        this.objectInputStream = objectInputStream;
        this.objectOutputStream = objectOutputStream;
    }

    public void serializeStorage(Storage storage) throws IOException {
        objectOutputStream.writeObject(storage);
        objectOutputStream.flush();
        objectOutputStream.close();
    }

    public Storage desirealizeStorage () throws IOException, ClassNotFoundException {
        Storage storage = (Storage) objectInputStream.readObject();
        return storage;
    }

}
