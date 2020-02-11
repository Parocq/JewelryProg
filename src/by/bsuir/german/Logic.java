package by.bsuir.german;

import java.util.ArrayList;
import java.util.Scanner;


public class Logic {

    private  Scanner scanner = new Scanner(System.in);
    private String title;
    private double price, weight;
    private Storage storage;

//    void ShowInfo (Adornment a){
//        System.out.println("Название украшения: " + adornmentTitle);
//        System.out.println("Тип бижютерии: " + adorsmentType);
//        printStonesUsed(stonesList);
//        System.out.println("Использованый метал: " + metalTitle);
//        System.out.println("Вес украшения: "+ sumVeight);
//        System.out.println("Итоговая цена украшения: " + price);
//    }

     void createNewStone() {
        boolean type;
        System.out.println("Введите название камня: ");
        title = scanner.nextLine();
        System.out.println("Камень является: 1.Драгоценным 2.Полудрагоценным");
        int q = 0;
        q = scanner.nextInt();
        if (q == 2) {
            type = false;
        } else type = true;
        System.out.println("Какого цвета камень?");
        String color = scanner.nextLine();
        System.out.println("Каково значение светопропускания у камня?");
        double transparence = scanner.nextDouble();//определиться в чем указывать значение светопропускания
        System.out.println("Сколько весит камень? (указать знаечние в каратах)");
        weight = scanner.nextDouble();
        System.out.println("Какова стоимость$ камня?");
        price = scanner.nextDouble();
        System.out.println("Камень успешно добавлен!");

        Stone stone = new Stone(title, weight, price, color, type, transparence);
        storage.addStoneOnStock(stone);
    }

    void createNewMetal() {
        System.out.println("ведите название металла: ");
        title = scanner.nextLine();
        System.out.println("Сколько весит камень? (указать знаечние в каратах)");
        weight = scanner.nextDouble();
        System.out.println("Какова стоимость$ камня?");
        price = scanner.nextDouble();
        System.out.println("Проба добавляемого металла составляет:");
        double sample = scanner.nextDouble();
        System.out.println("Объем добавляемого металла(см^3):");
        double volume = scanner.nextDouble();

        Metal metal = new Metal(title, price, weight, sample, volume);
        storage.addMetalOnStock(metal);
    }

    Object chooseBase (int type){
        RingBase usedRingBase;
        EarringBase usedEarringBase;
        NecklaceBase usedNecklaceBase;

        System.out.println("Какую основу использовать?(Нажмите 0 для выхода)");
        int numberOfBase = scanner.nextInt();
        switch (type) {
            case 1:
                storage.selectRingTitles(storage.getRingBases());
                usedRingBase = storage.getRingBases().get(numberOfBase -1);
                storage.getRingBases().remove(numberOfBase - 1);
                return  usedRingBase;
            case 2:
                storage.selectNecklaceTitles(storage.getNecklaceBases());
                usedNecklaceBase = storage.getNecklaceBases().get(numberOfBase-1);
                storage.getNecklaceBases().remove(numberOfBase - 1);
                return usedNecklaceBase;
                break;
            case 3:
                storage.selectEarringTitles(storage.getEarringBases());
                usedEarringBase = storage.getEarringBases().get(numberOfBase-1);
                storage.getEarringBases().remove(numberOfBase - 1);
                return usedEarringBase;
                break;
            default: return null;
            //break;///////////////////////как организовать выход подумай
            //https://www.geeksforgeeks.org/g-fact-64/
        }
    }

    void createNewAdorment() {
        System.out.println("Как будет называться создаваемое украшение?");
        title = scanner.nextLine();
        System.out.println("Какой тип украшения создаем?");
        System.out.println("1.Кольцо  2.Ожерелье  3.Серьги");
        int type = scanner.nextInt();


        ArrayList<Stone> stonesToUse;
        int i = 0;
        System.out.println("Какие камни использовать?");
        while (i != 3) {
            System.out.println("1.Создать новый камень 2.Выбрать камень из склада 3.Не использовать камни(далее)");
            i = scanner.nextInt();
            switch (i) {
                case 1:
                    createNewStone();
                    System.out.println("Камень добавлен. Вы можете найти его на складе.");
                    break;
                case 2:
                    Stone stone;
                    stone
                    //stonesToUse.add(stone);
                    break;
                case 3:
                    break;
            }
        }


        Adornment adornment = new Adornment();
        storage.addAdornmentOnStock(adornment);
    }


}
