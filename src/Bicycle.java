import java.util.ArrayList;
import java.util.Comparator;
public class Bicycle {
    int wheels;
    public static ArrayList<Bicycle> only_bicycles = new ArrayList<Bicycle>();
    double diameter;
    String condition;
    double price;
    double summary;
    public Bicycle(double diameter, String condition){
        this.diameter = diameter;
        this.condition = condition;
        summary = diameter * 2;
        only_bicycles.add(this);
        wheels = 2;
    }

    public Bicycle(double diameter, String condition, double price){
        this.diameter = diameter;
        this.price = price;
        this.condition = condition;
        summary = diameter * 2;
        only_bicycles.add(this);
        wheels = 2;
    }

    public void setDiameter(double diameter){
        this.diameter = diameter;
        summary = diameter * 2;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setCondition(String condition){
        this.condition = condition;
    }

    public void usage(){
        System.out.println("Едем, едем на двух колесах");
    }

    public static double getRandomNumber() {
        double x = Math.random();
        return x;
    }
}

class Tricycle extends Bicycle{
    int wheels = 3;
    public static ArrayList<Tricycle> only_tricycles = new ArrayList<Tricycle>();
    public Tricycle(double diameter, String condition){
        super(diameter, condition);
        summary = diameter * 3;
        only_tricycles.add(this);
        wheels = 3;
    }
    public Tricycle(double diameter, String condition, double price){
        super(diameter, condition, price);
        summary = diameter * 3;
        only_tricycles.add(this);
        wheels = 3;
    }

    @Override
    public void usage(){
        System.out.println("Едем, едем на трех колесах");
    }
    @Override
    public void setDiameter(double diameter){
        this.diameter = diameter;
        summary = diameter * 3;
    }

}

class Unicycle extends Bicycle{
    int wheels = 1;
    public static ArrayList<Unicycle> only_unicycles = new ArrayList<Unicycle>();
    public Unicycle(double diameter, String condition){
        super(diameter, condition);
        summary = diameter;
        only_unicycles.add(this);
        wheels = 1;
    }
    public Unicycle(double diameter, String condition, double price){
        super(diameter, condition, price);
        summary = diameter;
        only_unicycles.add(this);
        wheels = 1;
    }

    @Override
    public void usage(){
        System.out.println("Едем, едем на одном колесе");
    }
    @Override
    public void setDiameter(double diameter){
        this.diameter = diameter;
        summary = diameter;
    }


}
interface Workshop {
     static void repair(Bicycle obj){
        obj.condition = "Исправен";
        System.out.println("Починка успешна");
    }
    static void repair(Unicycle obj){
        obj.condition = "Исправен";
        System.out.println("Починка успешна");
    }
    static void repair(Tricycle obj){
        obj.condition = "Исправен";
        System.out.println("Починка успешна");
    }
     static void repair_all_uni(){
         for (int i = 0; i < Unicycle.only_unicycles.size(); i++){
             Workshop.repair(Unicycle.only_unicycles.get(i));
         }
    }
}


