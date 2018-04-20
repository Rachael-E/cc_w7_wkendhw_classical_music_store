package Instruments;
import Behaviours.IPlayable;
import InstrumentType.InstrumentType;
import Instruments.Instruments;

public class Violin extends Instruments implements IPlayable {

    public Violin(String instrumentName, double boughtPrice, double sellPrice, InstrumentType instrumentType) {
        super(instrumentName, boughtPrice, sellPrice, instrumentType);
    }

    @Override
    public String play() {
        return "I am Nicola Benedetti's favourite instrument!";
    }
}
