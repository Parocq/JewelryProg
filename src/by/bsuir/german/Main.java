package by.bsuir.german;

import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String title; boolean type; String color; double transparence,  weight,  price;
        double sample, volume;
        Logic logic = new Logic();
        Storage storage = new Storage();

        System.out.println("Добро пожаловать в нашу ювелирную лавку!");
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        for (int i = 0; i!=6;){
            System.out.print("Что будем делать?\n1.Добавить камень на склад\n2.Добавить металл на склад\n3.Создать освнову для украшения\n");
            System.out.println("4.Создать украшение\n5.Просмотреть уже имеющиеся материалы и украшения\n6.Выход");
            i = scanner.nextInt();
            switch (i) {
                case 1:
//                    Stone stone = new Stone("Diamond", 23.2,336.3, "White", true,55.9);
//                    storage.addStoneOnStock(stone);
                    logic.createNewStone();
                    break;
                case 2:
                    logic.createNewMetal();
                    break;
                case 3:
                    logic.createNewBase();
                    break;
                case 4:
                    logic.createNewAdornment();
                    break;
                case 5:
                    storage.printAll();
                    break;
                case 6:
                    i = 6;
                    break;
                default:
                    System.out.println("Такого варианта не существует");
                    break;
            }
        }
    }
}
