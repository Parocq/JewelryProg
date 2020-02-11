package by.bsuir.german;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int i;
        String title; boolean type; String color; double transparence,  weight,  price;
        double sample, volume;

        System.out.println("Добро пожаловать в нашу ювелирную лавку!");

        System.out.print("Что будем делать?\n1.Добавить камень\n2.Добавить металл\n3.Создать украшение\n");
        System.out.println("4.Просмотреть уже имеющиеся материалы и украшения");
        Scanner scanner = new Scanner(System.in);
        i = scanner.nextInt();
        switch (i) {
            case 1:
//                Logic.createNewStone();
                break;
            case 2:
//                Logic.createNewMetal();
                break;
            case 3:


                break;
            case 4:

                break;
        }

//        Adornment adornment = new Metal();
//        adornment
    }
}
