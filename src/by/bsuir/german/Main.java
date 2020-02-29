package by.bsuir.german;

import by.bsuir.german.entity.Metal;
import by.bsuir.german.entity.RingBase;
import by.bsuir.german.entity.Stone;
import by.bsuir.german.exception.InvalidFieldValueException;
import by.bsuir.german.service.IO;
import by.bsuir.german.service.Logic;
import by.bsuir.german.service.Serialization;
import by.bsuir.german.service.Storage;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws InvalidFieldValueException, IOException {
//
//        Metal test = new Metal("fewfwe", 32, 324,423);
//        RingBase test1 = new RingBase("r3r3",234,234,test,23);
//        Stone test2 = new Stone("test1",100,100,"Red",true,3);
//        Stone test3 = new Stone("test2",200,200,"White",false,3);
//        storage.addMetalOnStock(test);
//        storage.addRingBaseOnStock(test1);
//        storage.addStoneOnStock(test2);
//        storage.addStoneOnStock(test3);


        System.out.println("Добро пожаловать в нашу ювелирную лавку!");
            try {
                Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

                Storage storage = new Storage();
                Logic logic = new Logic(storage);

//                FileOutputStream("Storage.txt")
                FileOutputStream fileOutputStream = new FileOutputStream("Storage.txt",true);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                FileInputStream fileInputStream = new FileInputStream("Storage.txt");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

                Serialization serialization = new Serialization(objectOutputStream,objectInputStream);

                FileWriter fileWriter = new FileWriter("MainTask.txt");
                FileReader fileReader = new FileReader("MainTask.txt");
                Scanner fileScanner = new Scanner(fileReader);
                IO io = new IO(fileReader,fileWriter, fileScanner, storage);



                Menu menu = new Menu(scanner, io, serialization, storage, logic);

                menu.showMenu();
            } catch (InputMismatchException e){
                System.out.println("Ошибка при вводе данных! Проверьте вводимые типы!");
            } catch (InvalidFieldValueException ex){
                System.out.println("Недопустимое значение данной величины!");
            } catch (IOException exc){
                System.out.println("Проблемы с вводом или выводом!");
            } catch (ClassNotFoundException exce){System.out.println(exce.getMessage());}
    }
}
