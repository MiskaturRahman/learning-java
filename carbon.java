import java.util.*;

interface CarbonFootprint {
    void getCarbonFootprint();
}

class Building implements CarbonFootprint {
    private double electricity = 1.37;
    private double squareFeet;

    public Building(double st) {
        squareFeet = st;
    }

    public void getCarbonFootprint() {
        System.out.println("Carbon Footprint from Building: " + squareFeet * electricity);
    }
}

class Car implements CarbonFootprint {
    private double gallons;

    public Car(double st) {
        gallons = st;
    }

    public void getCarbonFootprint() {
        System.out.println("Carbon Footprint from Car is: " + gallons * 20);
    }
}

class Bicycle implements CarbonFootprint {
    private String type;

    public Bicycle(String st) {
        type = st;
    }

    public void getCarbonFootprint() {
        System.out.println("Carbon Footprint from Bicycle is none." + "And the type is: " + type);
    }
}

public class carbon {
    public static void main(String[] args) {

        ArrayList<CarbonFootprint> list = new ArrayList<CarbonFootprint>();
        Building bd = new Building(100.2);
        list.add(bd);
        Car cr = new Car(50);
        list.add(cr);
        Bicycle bi = new Bicycle("Sports");
        list.add(bi);
        for (int i = 0; i < list.size(); i++) {
            list.get(i).getCarbonFootprint();
        }

    }
}