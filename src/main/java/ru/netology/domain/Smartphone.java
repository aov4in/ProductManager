package ru.netology.domain;

import java.util.Objects;

public class Smartphone extends Product {
    private String smartphoneName;
    private String manufacturer;

    public Smartphone(int id, String name, int price, String smartphoneName, String manufacturer) {
        super(id, name, price);
        this.smartphoneName = smartphoneName;
        this.manufacturer = manufacturer;
    }

    public String getSmartphoneName() {
        return smartphoneName;
    }

    public void setSmartphoneName(String smartphoneName) {
        this.smartphoneName = smartphoneName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}