package com.pluralsight;

public class cellphoneApplication {

    private double serialNumber;
    private String model;
    private double phoneNumber;
    private String owner;

    public double getSerialNumber() {
        return serialNumber;
    }

    public String getModel() {
        return model;
    }

    public double getPhoneNumber() {
        return phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setPhoneNumber(double phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSerialNumber(double serialNumber) {
        this.serialNumber = serialNumber;
    }
}

