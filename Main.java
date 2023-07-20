import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<CarbonFootprint> objects = new ArrayList<>();

        Building building = new Building("123 Main St", 1000.0, 4);
        objects.add(building);

        Car car = new Car("Toyota", "Camry", 2020, 14.0, 10000.0);
        objects.add(car);

        Bicycle bicycle = new Bicycle("Trek", 21);
        objects.add(bicycle);

        for (CarbonFootprint object : objects) {
            String type = object.getClass().getSimpleName();
            double footprint = object.getCarbonFootprint();
            System.out.printf("%s has a carbon footprint of %.2f kgCO2e%n", type, footprint);
        }
    }
}
