package br.com.cars.model;

public class Car {
    private String plate;
    private String model;
    private int tankCapacity;
    private Driver driver;

    public Car(String plate, String model, int tankCapacity) {
        this.plate = plate;
        this.model = model;
        this.tankCapacity = tankCapacity;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Car -> Model: " + model + ", Plate: " + plate;
    }
}
