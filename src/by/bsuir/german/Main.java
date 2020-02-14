package by.bsuir.german;

import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //String title; boolean type; String color; double transparence,  weight,  price;
        //double sample, volume;

        Storage storage = new Storage();
        Logic logic = new Logic();

        System.out.println("Добро пожаловать в нашу ювелирную лавку!");
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Menu menu = new Menu(scanner);

        boolean flag = true;
        int i = 0;
        while (flag){
            System.out.print("Что будем делать?\n1.Добавить камень на склад\n2.Добавить металл на склад\n3.Создать освнову для украшения\n");
            System.out.println("4.Создать украшение\n5.Просмотреть уже имеющиеся материалы и украшения\n6.Выход\n7.Доп. функции");

              //  String str = scanner.nextIn();

//            scanner.skip("/n");
            i = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            switch (i) {
                case 1:
                    menu.createNewStone();
                    break;
                case 2:
                    menu.createNewMetal();
                    break;
                case 3:
                    if (storage.getMetals().size() == 0) {
                        System.out.println("Вы не можете создать основу, не имея ни одного металла.");
                    }else menu.createNewBase();
                    break;
                case 4:
                    if (storage.getRingBases().size() == 0 && storage.getNecklaceBases().size() == 0 && storage.getEarringBases().size() == 0){
                        System.out.println("Вы не можете создать украшение, не имея ни одной основы.");
                    } else menu.createNewAdornment();
                    break;
                case 5:
                    storage.printAll();
                    break;
                case 6:
                    flag = false;
                    scanner.close();
                    break;
                case 7:
                    System.out.println("1.Вывести информацию об украшении \n2.Отсортировать склад...\n3.Поиск камней по диапазону");
                    int k =scanner.nextInt();
                    if (k==1){
                        menu.sort();
                    } else if (k==2){
                        menu.showAdornmentInfo();
                    } else menu.searchByTransparence();
                    break;
                default:
                    System.out.println("Такого варианта не существует");
                    break;
            }
            System.out.println();
        }
    }
}
