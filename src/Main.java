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
                System.out.println("Введите название камня: ");
                title = scanner.nextLine();
                System.out.println("Камень является: 1.Драгоценным 2.Полудрагоценным");
                int q=0;
                q = scanner.nextInt();
                if(q == 2){
                    type = false;
                } else type = true;
                System.out.println("Какого цвета камень?");
                color = scanner.nextLine();
                System.out.println("Каково значение светопропускания у камня?");
                transparence = scanner.nextDouble();//определиться в чем указывать значение светопропускания
                System.out.println("Сколько весит камень? (указать знаечние в каратах)");
                weight = scanner.nextDouble();
                System.out.println("Какова стоимость$ камня?");
                price = scanner.nextDouble();
                System.out.println("Камень успешно добавлен!");

                Stone stone = new Stone(title, weight, price, color, type, transparence);
                break;
            case 2:
                System.out.println("ведите название металла: ");
                title = scanner.nextLine();
                System.out.println("Сколько весит камень? (указать знаечние в каратах)");
                weight = scanner.nextDouble();
                System.out.println("Какова стоимость$ камня?");
                price = scanner.nextDouble();
                System.out.println("Проба добавляемого металла составляет:");
                sample = scanner.nextDouble();
                System.out.println("Объем добавляемого металла(см^3):");
                volume = scanner.nextDouble();

                Metal metal = new Metal(title, price, weight, sample, volume);
                break;
            case 3:
                System.out.println("Как будет называться создаваемое украшение?");


                break;
            case 4:

                break;
        }

//        Adornment adornment = new Metal();
//        adornment
    }
}
