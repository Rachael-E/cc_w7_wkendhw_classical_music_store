public enum InstrumentType {

    CLARINET("Clarinet"),
    OBOE("Oboe"),
    VIOLIN("Violin"),
    FRENCHHORN("French Horn");

    private String instrumentName;

    InstrumentType(String name){ this.instrumentName = instrumentName;}

    public String getInstrumentName() {
        return instrumentName;
    }
}
