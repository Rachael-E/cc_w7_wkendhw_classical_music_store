package Instruments;

import Behaviours.IPlayable;
import InstrumentType.InstrumentType;

public class FrenchHorn extends Instruments implements IPlayable {

    public FrenchHorn(String instrumentName, double boughtPrice, double sellPrice, InstrumentType instrumentType) {
        super(instrumentName, boughtPrice, sellPrice, instrumentType);
    }

    @Override
    public String play() {
        return "I am the focus of Mozart's Horn Concerto No.3!";
    }
}
