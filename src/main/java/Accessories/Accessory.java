package Accessories;

import Behaviours.ISellable;

public abstract class Accessory implements ISellable {

    private String name;
    private double boughtPrice;
    private double sellPrice;
    private String description;

    public Accessory(String name, double boughtPrice, double sellPrice, String description){
        this.name = name;
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public double calculateMarkup() {
        return getSellPrice() - getBoughtPrice();
    }
}
