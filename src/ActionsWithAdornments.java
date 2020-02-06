//import java.util.ArrayList;
//
//public class ActionsWithAdornments {
//
//
//
//
//    void ShowInfo (Adornment a){
//        System.out.println("Название украшения: " + adornmentTitle);
//        System.out.println("Тип бижютерии: " + adorsmentType);
//        printStonesUsed(stonesList);
//        System.out.println("Использованый метал: " + metalTitle);
//        System.out.println("Вес украшения: "+ sumVeight);
//        System.out.println("Итоговая цена украшения: " + price);
//    }
//
//
//    double calculatePrice (ArrayList<Stone> stones, Metal metal){
//        for (int i = 0; i< stonesList.size(); i++){
//            price += stonesList.get(i).getPrice();
//        }
//        price += metal.getPrice();
//        return price;
//    }
//
//    double calculateWeight (ArrayList<Stone> stones, Metal metal){
//        for (int i = 0; i< stonesList.size(); i++){
//            sumVeight += stonesList.get(i).getWeight();
//        }
//        sumVeight += metal.getWeight();
//        return sumVeight;
//    }
//
//    String selectMetalTitle (Metal metal){
//        metalTitle = this.metal.getTitle();
//        return metalTitle;
//    }
//
//
//    void printStonesUsed (ArrayList<Stone> StonesList){
//        System.out.print("Состоит из следующих камней: ");
//        for (int i = 0; i<StonesList.size()-1;i++){
//            System.out.print(StonesList.get(i).getTitle()+ ", ");
//        }
//        System.out.print(StonesList.get(StonesList.size()-1).getTitle()+ ".\n");
//    }
//}
