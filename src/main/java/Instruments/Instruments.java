package Instruments;

import Behaviours.ISellable;
import InstrumentType.InstrumentType;

public abstract class Instruments implements ISellable {

    private String name;
    private double boughtPrice;
    private double sellPrice;
    private InstrumentType instrumentType;

    public Instruments(String name, double boughtPrice, double sellPrice, InstrumentType instrumentType) {
        this.name = name;
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
        this.instrumentType = instrumentType;
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

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    @Override
    public double calculateMarkup() {
        return getSellPrice() - getBoughtPrice();
    }
}
