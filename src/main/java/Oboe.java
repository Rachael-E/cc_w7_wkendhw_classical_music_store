public class Oboe extends Instruments implements IPlayable {

    public Oboe(String instrumentName, double boughtPrice, double sellPrice, InstrumentType instrumentType) {
        super(instrumentName, boughtPrice, sellPrice, instrumentType);
    }

    @Override
    public String play() {
        return "I am the echo in Berlioz Symphonie Fantastique!";
    }
}
