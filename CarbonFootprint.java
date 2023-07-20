public interface CarbonFootprint {
    double getCarbonFootprint();
}

public class Building implements CarbonFootprint {
    private String address;
    private double area; // in square meters
    private int numResidents;

    public Building(String address, double area, int numResidents) {
        this.address = address;
        this.area = area;
        this.numResidents = numResidents;
    }

    public double getArea() {
        return area;
    }

    public int getNumResidents() {
        return numResidents;
    }

    @Override
    public double getCarbonFootprint() {
        // Calculate carbon footprint based on average energy consumption per square meter and per person
        double energyConsumption = 200.0; // kWh/m^2/year
        double carbonIntensity = 0.5; // kgCO2e/kWh
        return energyConsumption * area * numResidents * carbonIntensity;
    }
}

public class Car implements CarbonFootprint {
    private String make;
    private String model;
    private int year;
    private double fuelEfficiency; // in km/L
    private double distance; // in km

    public Car(String make, String model, int year, double fuelEfficiency, double distance) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelEfficiency = fuelEfficiency;
        this.distance = distance;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public double getDistance() {
        return distance;
    }

    @Override
    public double getCarbonFootprint() {
        // Calculate carbon footprint based on fuel consumption and emissions factor
        double fuelConsumption = distance / fuelEfficiency; // in L
        double emissionsFactor = 2.31; // kgCO2e/L
        return fuelConsumption * emissionsFactor;
    }
}

public class Bicycle implements CarbonFootprint {
    private String brand;
    private int numGears;

    public Bicycle(String brand, int numGears) {
        this.brand = brand;
        this.numGears = numGears;
    }

    public int getNumGears() {
        return numGears;
    }

    @Override
    public double getCarbonFootprint() {
        // Bicycles do not produce direct emissions, so their carbon footprint is zero
        return 0.0;
    }
}