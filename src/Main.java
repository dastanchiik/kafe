import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Шаурма 140сом"+"\n"+"\n"+"Шаурма 120сом"+"\n"+"\n"+"Фри 60сом"+"\n"+"\n"+"Фри 70сом"+"\n"+"\n"+"Крылышки 480сом"+"\n"+"\n"+"Крылышки 500сом"+"\n"+"\n"+"Хотдог 80сом"+"\n"+"\n"+"Хотдог 60сом"+"\n"+"\n"+"Бургер 60сом"+"\n"+"\n"+"Бургер 80сом"+"\n");
        System.out.println("Введите 1 чтобы выбрать или закончите нажав 0"+"\n");
        int scanners = scanner.nextInt();
        int count = 0;
        while (scanners!=0){
            System.out.println("Введите название бльюда которую хотите выбрать");
            String name = scanner.next();
            System.out.println("введите её стоимость");
            int price = scanner.nextInt();
            count +=price;
            System.out.println("Введите 1 чтобы выбрать или закончите нажав 0");
            scanners = scanner.nextInt();
        }
        System.out.println("Ваш заказ будет готов через 10 минут"+"\n"+"Итого: "+count+" сом");

    }
}