package Accessories;

import InstrumentType.InstrumentType;

public class Reed extends Accessory {

    private InstrumentType instrumentType;

    public Reed(String name, double boughtPrice, double sellPrice, String description, InstrumentType instrumentType) {
        super(name, boughtPrice, sellPrice, description);
        this.instrumentType = instrumentType;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }
}
