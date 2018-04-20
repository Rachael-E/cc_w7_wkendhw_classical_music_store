public abstract class Instruments {

    private String instrumentName;
    private double boughtPrice;
    private double sellPrice;
    private InstrumentType instrumentType;

    public Instruments(String instrumentName, double boughtPrice, double sellPrice, InstrumentType instrumentType) {
        this.instrumentName = instrumentName;
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
        this.instrumentType = instrumentType;
    }

    public String getInstrumentName() {
        return instrumentName;
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
}
