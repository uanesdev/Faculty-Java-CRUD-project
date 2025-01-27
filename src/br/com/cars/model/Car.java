package br.com.cars.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String plate;
    private String model;
    private int tankCapacity;
    private Driver driver;
    private ArrayList<Supply> supplys;

    public Car(String plate, String model, int tankCapacity) {
        this.plate = plate;
        this.model = model;
        this.tankCapacity = tankCapacity;
        this.supplys = new ArrayList<>();
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

    public ArrayList<Supply> getSupplys() {
        return supplys;
    }

    public void setSupplys(ArrayList<Supply> supplys) {
        this.supplys = supplys;
    }

    @Override
    public String toString() {
        return "Car -> Model: " + model + ", Plate: " + plate;
    }
}
