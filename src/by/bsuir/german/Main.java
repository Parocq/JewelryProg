package by.bsuir.german;

import by.bsuir.german.entity.Metal;
import by.bsuir.german.entity.RingBase;
import by.bsuir.german.entity.Stone;
import by.bsuir.german.exception.InvalidFieldValueException;
import by.bsuir.german.service.IO;
import by.bsuir.german.service.Serialization;
import by.bsuir.german.service.Storage;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws InvalidFieldValueException, IOException {


        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Storage storage = new Storage();

        FileOutputStream fosStones = new FileOutputStream("Stones.out");
        ObjectOutputStream oosStones = new ObjectOutputStream(fosStones);
        FileInputStream fisStones = new FileInputStream("Stones.out");
        ObjectInputStream oisStones = new ObjectInputStream(fisStones);

        FileOutputStream fosMetal = new FileOutputStream("Metals.out");
        ObjectOutputStream oooMetals = new ObjectOutputStream(fosMetal);
        FileInputStream fisMetals = new FileInputStream("Metals.out");
        ObjectInputStream oisMetals = new ObjectInputStream(fisMetals);

        FileOutputStream fosAdornments = new FileOutputStream("Adornment.out");
        ObjectOutputStream oooAdornments = new ObjectOutputStream(fosAdornments);
        FileInputStream fisAdornment = new FileInputStream("Adornment.out");
        ObjectInputStream oisAdornments = new ObjectInputStream(fisAdornment);

        FileOutputStream fosRingBases = new FileOutputStream("RingBase.out");
        ObjectOutputStream oooRingBases = new ObjectOutputStream(fosRingBases);
        FileInputStream fisRingBases = new FileInputStream("RingBase.out");
        ObjectInputStream oisRingBases = new ObjectInputStream(fisRingBases);

        FileOutputStream fosNecklaceBases = new FileOutputStream("NecklaceBase.out");
        ObjectOutputStream oooNecklaceBases = new ObjectOutputStream(fosNecklaceBases);
        FileInputStream fisNecklaceBases = new FileInputStream("NecklaceBase.out");
        ObjectInputStream oisNecklaceBases = new ObjectInputStream(fisNecklaceBases);

        FileOutputStream fosEarringBases = new FileOutputStream("EarringBase.out");
        ObjectOutputStream oosEarringBases = new ObjectOutputStream(fosEarringBases);
        FileInputStream fisEarringBases = new FileInputStream("EarringBase.out");
        ObjectInputStream oisEarringBases = new ObjectInputStream(fisEarringBases);

        Serialization serialization = new Serialization(oosStones,oisStones,oooMetals,oisMetals,oooAdornments, oisAdornments,
                oooRingBases,oisRingBases,oooNecklaceBases,oisNecklaceBases,oosEarringBases,oisEarringBases, storage);

        FileWriter fileWriter = new FileWriter("MainTask.txt");
        FileReader fileReader = new FileReader("MainTask.txt");
        Scanner fileScanner = new Scanner(fileReader);
        IO io = new IO(fileReader,fileWriter, fileScanner, storage);



        Metal test = new Metal("fewfwe", 32, 324,423);
        RingBase test1 = new RingBase("r3r3",234,234,test,23);
        Stone test2 = new Stone("test1",100,100,"Red",true,3);
        Stone test3 = new Stone("test2",200,200,"White",false,3);
        storage.addMetalOnStock(test);
        storage.addRingBaseOnStock(test1);
        storage.addStoneOnStock(test2);
        storage.addStoneOnStock(test3);

        System.out.println("Добро пожаловать в нашу ювелирную лавку!");
        Menu menu = new Menu(scanner,io,serialization);

        boolean flag = true;
        while (flag){
            try {
                flag = menu.showMenu();
            } catch (InputMismatchException e){
                System.out.println("Ошибка при вводе данных! Проверьте вводимые типы!");
                scanner.next();
            } catch (InvalidFieldValueException ex){
                System.out.println("Недопустимое значение данной величины!");
            } catch (IOException exc){
                System.out.println("Проблемы с вводом или выводом!");
            } catch (ClassNotFoundException exce){System.out.println(exce.getMessage());}
            System.out.println();
        }


    }
}
