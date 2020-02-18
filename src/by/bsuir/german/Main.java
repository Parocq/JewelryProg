package by.bsuir.german;

import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Storage storage = new Storage();

        Metal test = new Metal("fewfwe", 32, 324,423);
        RingBase test1 = new RingBase("r3r3",234,234,test,23);
        Stone test2 = new Stone("test1",100,100,"Red",true,3);
        Stone test3 = new Stone("test2",200,200,"White",false,3);
        storage.addMetalOnStock(test);
        storage.addRingBaseOnStock(test1);
        storage.addStoneOnStock(test2);
        storage.addStoneOnStock(test3);

        System.out.println("Добро пожаловать в нашу ювелирную лавку!");
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Menu menu = new Menu(scanner);

        menu.showMenu();
    }
}
