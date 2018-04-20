import javax.sound.midi.Instrument;

public class Clarinet extends Instruments implements IPlayable {

    public Clarinet(String instrumentName, double boughtPrice, double sellPrice, InstrumentType instrumentType) {
        super(instrumentName, boughtPrice, sellPrice, instrumentType);
    }

    @Override
    public String play() {
        return "I am the main star of Gerschwin, Rhapsody in Blue!";
    }


}
