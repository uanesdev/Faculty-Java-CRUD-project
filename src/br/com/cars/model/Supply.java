package br.com.cars.model;

import java.util.Date;

public class Supply {
    private Car car;
    private String fuelType;
    private double liters;
    private double literValue;
    private double totalValue;
    private Date supplyDate;

    public Supply(Car car,
                  String fuelType,
                  double liters,
                  double literValue) {

        this.car = car;
        this.fuelType = fuelType;
        this.liters = liters;
        this.literValue = literValue;
        this.totalValue = literValue * liters;
        this.supplyDate = new Date();
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getLiters() {
        return liters;
    }

    public void setLiters(double liters) {
        this.liters = liters;
    }

    public double getLiterValue() {
        return literValue;
    }

    public void setLiterValue(double literValue) {
        this.literValue = literValue;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public Date getSupplyDate() {
        return supplyDate;
    }

    public void setSupplyDate(Date supplyDate) {
        this.supplyDate = supplyDate;
    }

    @Override
    public String toString() {
        return "Fuel type: " + fuelType +
                "\nLiters: " + liters +
                "\nLiter value: " + literValue +
                "\nTotal value: " + totalValue +
                "\nSupply vate: " + supplyDate;
    }
}