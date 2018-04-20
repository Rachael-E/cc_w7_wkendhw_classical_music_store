package Accessories;

import InstrumentType.InstrumentType;

public class ViolinBow extends Accessory {

    private InstrumentType instrumentType;

    public ViolinBow(String name, double boughtPrice, double sellPrice, String description, InstrumentType instrumentType) {
        super(name, boughtPrice, sellPrice, description);
        this.instrumentType = instrumentType;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }
}
