import java.util.*;

public class Main {
    public static ArrayList<Tricycle> now_tricycles = new ArrayList<Tricycle>();
    public static ArrayList<Unicycle> now_unicycles = new ArrayList<Unicycle>();
    public static ArrayList<Bicycle> now_bicycles = new ArrayList<Bicycle>();
    public static void getRandomBike(){
        int wheels = (int) ( Math.random() * (4-1) ) + 1;
        double diameter =  ( Math.random() * (30-18) ) + 18;
        double price = ( Math.random() * (50000-10000) ) + 10000;
        if (wheels == 1){
            now_unicycles.add(new Unicycle(diameter, "Требует ремонта", price));
        }
        else if (wheels == 2){
            now_bicycles.add(new Bicycle(diameter, "Требует ремонта", price));
        }
        else {
            now_tricycles.add(new Tricycle(diameter, "Требует ремонта", price));
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++){
            getRandomBike();
        }
        Workshop.repair_all_uni();
        System.out.println("Я не могу сортировать список по параметру объекта :(");
    }
}
