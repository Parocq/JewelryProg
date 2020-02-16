package by.bsuir.german;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Menu {

    private Scanner scanner ;
    private String title;
    private double price, weight;
    private Storage storage = new Storage();
    private static List<Stone> stonesToUse = new ArrayList<>();
    private Logic logic = new Logic();

    public static List<Stone> getStonesToUse() {
        return stonesToUse;
    }

    public Menu() {
    }

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    void searchByTransparence (){
        System.out.println("Введите нижнюю границу диапазона показателя прозрачности:");
        double i = scanner.nextDouble();
        System.out.println("Введите верхнюю границу диапазона показателя прозрачности:");
        double j = scanner.nextDouble();
        System.out.println("Камни на складе, удовлетворяющие условию:");
        storage.selectStoneTitles(logic.searchForTransparence(i,j));
    }

    void showAdornmentInfo (){
        System.out.println("Информацию о каком украшении вывести?");
        storage.selectAdornmentTitles(storage.getAdornments());
        int i = scanner.nextInt()-1;
        System.out.println("Название украшения:          " + storage.getAdornments().get(i).getTitle());
        System.out.println("Тип бижютерии:               " + storage.getAdornments().get(i).getType());
        System.out.println("Список использованных камней:");
        storage.selectStoneTitles(storage.getAdornments().get(i).getUsedStones());
        System.out.println("Вес украшения:               " + logic.calculateWeight(i));
        System.out.println("Итоговая цена украшения:     " + logic.calculatePrice(i));
    }

    void sort (){
        System.out.println("Какой список отсортировать?");
        System.out.println("1.Украшения\n2.Основы для колец\n3.Основы для ожерелий\n4.Основы для серег");
        System.out.println("5.Камни\n6.Металлы\n");
        int i = scanner.nextInt();
        switch (i){
            case 1:
                logic.sortAdornmentByTitle(storage.getAdornments());
                break;
            case 2:
                logic.sortRingBaseByTitle(storage.getRingBases());
                break;
            case 3:
                logic.sortNecklaceBaseByTitle(storage.getNecklaceBases());
                break;
            case 4:
                logic.sortEarringBaseByTitle(storage.getEarringBases());
                break;
            case 5:
                System.out.println("По какому параметру сортировать?");
                System.out.println("1.Название \n2.Цена\n");
                int j = scanner.nextInt();
                if (j==1){
                    logic.sortStonesByTitle(storage.getStones());
                } else logic.sortStonesByPrice(storage.getStones());
                break;
            case 6:
                logic.sortMetalByTitle(storage.getMetals());
                break;
        }
    }

    //-------------------------------------------------------

    void createNewStone() {
        boolean type;
        System.out.println("Введите название камня: ");
        title = scanner.nextLine();
        System.out.println("Камень является: 1.Драгоценным 2.Полудрагоценным");
        int q = 0;
        q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (q == 2) {
            type = false;
        } else {
            type = true;
        }
        System.out.println("Какого цвета камень?");
        String color;
        color = scanner.nextLine();
        System.out.println("Каково значение светопропускания у камня?");
        double transparence;
        transparence = scanner.nextDouble();//определиться в чем указывать значение светопропускания
        System.out.println("Сколько весит камень? (указать знаечние в каратах)");
        weight = scanner.nextDouble();
        System.out.println("Какова стоимость$ камня?");
        price = scanner.nextDouble();

        Stone stone = new Stone(title, weight, price, color, type, transparence);
        storage.addStoneOnStock(stone);
        System.out.println("Новый камень успешно добавлен!");
    }

    void createNewMetal() {
        System.out.println("Ведите название металла: ");
        title = scanner.nextLine();
        System.out.println("Сколько весит металл?");
        weight = scanner.nextDouble();
        System.out.println("Какова стоимость$ металла?");
        price = scanner.nextDouble();
        System.out.println("Проба добавляемого металла составляет:");
        double sample = scanner.nextDouble();

        Metal metal = new Metal(title, price, weight, sample);
        storage.addMetalOnStock(metal);
        System.out.println("Новый метал успешно добавлен!");
    }

    void createNewAdornment() {
        Object object;
        RingBase ringBase;
        EarringBase earringBase;
        NecklaceBase necklaceBase;
        System.out.println("Как будет называться создаваемое украшение?");
        title = scanner.nextLine();
        System.out.println("Какой тип украшения создаем?");
        System.out.println("1.Кольцо  2.Ожерелье  3.Серьги");
        int type = scanner.nextInt();
        object = chooseBase(type);
        stonesToUse = chooseStones();
        switch (type){
            case 1:
                ringBase = (RingBase) object;
                Adornment adornment1 = new Adornment(title, 1, ringBase);
                storage.addAdornmentOnStock(adornment1);
                System.out.println("Украшение успешно создано и добавлено");
                break;
            case 2:
                necklaceBase = (NecklaceBase) object;
                Adornment adornment2 = new Adornment(title, 2, necklaceBase);
                storage.addAdornmentOnStock(adornment2);
                System.out.println("Украшение успешно создано и добавлено");
                break;
            case 3:
                earringBase = (EarringBase) object;
                Adornment adornment3 = new Adornment(title, 3, earringBase);
                storage.addAdornmentOnStock(adornment3);
                System.out.println("Украшение успешно создано и добавлено");
                break;
            default:
                System.out.println("Такого варианта ответа не существует");
                break;
        }
        stonesToUse.clear();
    }

    void createNewRingBase() {
        double diametr;
        Metal metal;
        System.out.println("Введите название для основы для кольца:");
        title = scanner.nextLine();
        System.out.println("Введите цену основы:");
        price = scanner.nextDouble();
        System.out.println("Введите вес основы:");
        weight = scanner.nextDouble();
        metal = chooseMetal();
        System.out.println("Введите диаметр основы для кольца:");
        diametr = scanner.nextDouble();

        RingBase ringBase = new RingBase(title,weight,price,metal,diametr);
        storage.addRingBaseOnStock(ringBase);
    }

    void createNewNecklaceBase () {
        double length;
        Metal metal;
        System.out.println("Введите название для основы для ожерелья:");
        title = scanner.nextLine();
        System.out.println("Введите цену основы:");
        price = scanner.nextDouble();
        System.out.println("Введите вес основы:");
        weight = scanner.nextDouble();
        metal = chooseMetal();
        System.out.println("Введите длину основы для ожерелья:");
        length = scanner.nextDouble();

        NecklaceBase necklaceBase = new NecklaceBase(title,weight,price,metal,length);
        storage.addNecklaceBaseOnStock(necklaceBase);
    }

    void createNewEarringBase () {
        boolean paired;
        Metal metal;
        System.out.println("Введите название для основы для серьги:");
        title = scanner.nextLine();
        System.out.println("Введите цену основы:");
        price = scanner.nextDouble();
        System.out.println("Введите вес основы:");
        weight = scanner.nextDouble();
        metal = chooseMetal();
        System.out.println("Создать пару серег либо одну серьгу:");
        System.out.println("1.Парные 2.Одиночная");
        int i;
        i = scanner.nextInt();
        if (i == 1) paired = true;
        else paired = false;
        EarringBase earringBase = new EarringBase(title,weight,price,metal,paired);
        storage.addEarringBaseOnStock(earringBase);
    }

    void createNewBase (){
        int i;
        System.out.println("Какую основу создать?");
        System.out.println("1.Кольца 2.Ожерелья 3.Серег");
        i = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//        if (i==1)createNewRingBase();
//        else if (i==2)createNewNecklaceBase();
//        else if (i==3)createNewEarringBase();
//        else System.out.println("Такого варианта не существует");
        switch (i){
            case 1: createNewRingBase();
            break;
            case 2: createNewNecklaceBase();
            break;
            case 3: createNewEarringBase();
            break;
            default:
                System.out.println("Такого варианта не существует");
                break;
        }
    }

    Object chooseBase (int type){
        RingBase usedRingBase;
        EarringBase usedEarringBase;
        NecklaceBase usedNecklaceBase;
        int numberOfBase;
        System.out.println("Какую основу использовать?(Нажмите 0 для выхода)");
        switch (type) {
            case 1:
                storage.selectRingTitles(storage.getRingBases());
                numberOfBase = scanner.nextInt();
                usedRingBase = storage.getRingBases().get(numberOfBase -1);
//                storage.getRingBases().remove(numberOfBase - 1);
                return  usedRingBase;
            case 2:
                storage.selectNecklaceTitles(storage.getNecklaceBases());
                numberOfBase = scanner.nextInt();
                usedNecklaceBase = storage.getNecklaceBases().get(numberOfBase-1);
//                storage.getNecklaceBases().remove(numberOfBase - 1);
                return usedNecklaceBase;
            case 3:
                storage.selectEarringTitles(storage.getEarringBases());
                numberOfBase = scanner.nextInt();
                usedEarringBase = storage.getEarringBases().get(numberOfBase-1);
//                storage.getEarringBases().remove(numberOfBase - 1);
                return usedEarringBase;
            default: return null;
            //https://www.geeksforgeeks.org/g-fact-64/
        }
    }

    List<Stone> chooseStones (){
        int flag = 0;
        System.out.println("Какие камни использовать?");
        while (flag != 3) {
            System.out.println("1.Создать новый камень 2.Выбрать камень из склада 3.Не использовать камни(далее)");
            flag = scanner.nextInt();
            switch (flag) {
                case 1:
                    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
                    createNewStone();
                    System.out.println("Камень добавлен. Вы можете найти его на складе.");
                    break;
                case 2:
                    chooseStone();
                    break;
                case 3:
                    flag = 3;
                    break;
            }

        }
        return stonesToUse;
    }

    void chooseStone (){
        int chosen;
        Stone stone;
        storage.selectStoneTitles(storage.getStones());
        chosen = scanner.nextInt();
        stone = storage.getStones().get(chosen - 1);
        stonesToUse.add(stone);
    }

    Metal chooseMetal (){
        int chosen;
        Metal metal;
        System.out.println("Выберите номер металла, который вы хотите использовать:");
        storage.selectMetalsTitles(storage.getMetals());
        chosen = scanner.nextInt();
        metal = storage.getMetals().get(chosen-1);
//        storage.getMetals().remove(i-1);
        return metal;
    }

}
