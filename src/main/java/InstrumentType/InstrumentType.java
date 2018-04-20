package InstrumentType;

public enum InstrumentType {

    WOODWIND("Woodwind"),
    STRING("String"),
    BRASS("Brass");

    private String instrumentName;

    InstrumentType(String name){ this.instrumentName = instrumentName;}

    public String getInstrumentName() {
        return instrumentName;
    }
}
