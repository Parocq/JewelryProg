import java.util.ArrayList;
import java.util.Scanner;


public class Logic {

    private static Scanner scanner = new Scanner(System.in);
    static private String title;
    static private double price, weight;

//    void ShowInfo (Adornment a){
//        System.out.println("Название украшения: " + adornmentTitle);
//        System.out.println("Тип бижютерии: " + adorsmentType);
//        printStonesUsed(stonesList);
//        System.out.println("Использованый метал: " + metalTitle);
//        System.out.println("Вес украшения: "+ sumVeight);
//        System.out.println("Итоговая цена украшения: " + price);
//    }

    static void createNewStone (){
        boolean type;
        System.out.println("Введите название камня: ");
        title = scanner.nextLine();
        System.out.println("Камень является: 1.Драгоценным 2.Полудрагоценным");
        int q=0;
        q = scanner.nextInt();
        if(q == 2){
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
        Storage.addStoneOnStock(stone);
    }

    static void createNewMetal (){
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
        Storage.addMetalOnStock(metal);
    }

    static void createNewAdorment (){
        System.out.println("Как будет называться создаваемое украшение?");
        title = scanner.nextLine();
        System.out.println("Какой тип украшения создаем?");
        System.out.println("1.Кольцо  2.Ожерелье  3.Серьги");
        int type = scanner.nextInt();
        System.out.println("Какую основу использовать?(Нажмите 0 для выхода)");
        int numberOfBase = scanner.nextInt();
        switch (type){
            case 1:
                selectRingTitles(Storage.ringBases);
                Storage.ringBases.remove(numberOfBase-1);
                break;
            case 2:
                selectNecklaceTitles(Storage.necklaceBases);
                Storage.necklaceBases.remove(numberOfBase-1);
                break;
            case 3:
                selectEarringTitles(Storage.earringBases);
                Storage.earringBases.remove(numberOfBase-1);
                break;
            case 0:
                break;
                break;///////////////////////как организовать выход подумай
        }

        Storage

        Adornment adornment = new Adornment();
        Storage.addAdornmentOnStock(adornment);
    }

    static void selectRingTitles (ArrayList<RingBase> ringBases){///и вот эти выводы куда девать, тут или в Storage  всё же.
        String str="";
        for (int i=0; i<ringBases.size(); i++){
            System.out.print(i+1);
            str += ringBases.get(i).getTitle();
            if (i == 5) System.out.println();
        }
        System.out.println(str);
    }

    static void selectNecklaceTitles (ArrayList<NecklaceBase> necklaceBases){
        String str="";
        for (int i=0; i<necklaceBases.size(); i++){
            System.out.print(i+1);
            str += necklaceBases.get(i).getTitle();
            if (i == 5) System.out.println();
        }
        System.out.println(str);
    }

    static void selectEarringTitles (ArrayList<EarringBase> earringBases){
        String str="";
        for (int i=0; i<earringBases.size(); i++){
            System.out.print(i+1);
            str += earringBases.get(i).getTitle();
            if (i == 5) System.out.println();
        }
        System.out.println(str);
    }
}
