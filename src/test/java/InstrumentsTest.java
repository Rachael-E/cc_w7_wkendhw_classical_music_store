import Instruments.*;

import InstrumentType.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentsTest {

    private Clarinet clarinet1;
    private Oboe oboe1;

    @Before
    public void before() {
        clarinet1 = new Clarinet("B Flat", 750, 1000, InstrumentType.WOODWIND);
        oboe1 = new Oboe("Contrabass", 750, 1000, InstrumentType.WOODWIND);
    }

    @Test
    public void clarinetHasName(){
        assertEquals("B Flat", clarinet1.getInstrumentName());
    }

    @Test
    public void clarinetHasBoughtPrice(){
        assertEquals(750, clarinet1.getBoughtPrice(), 0.1);
    }

    @Test
    public void clarinetHasSellPrice(){
        assertEquals(1000, clarinet1.getSellPrice(), 0.1);
    }

    @Test
    public void clarinetHasInstrumentType(){
        assertEquals(InstrumentType.WOODWIND, clarinet1.getInstrumentType());
    }

    @Test
    public void clarinetCanPlay(){
        assertEquals("I am the main star of Gerschwin, Rhapsody in Blue!", clarinet1.play());
    }

    @Test
    public void clarinetHasMarkUp(){
        assertEquals(250, clarinet1.calculateMarkup(), 0.1);
    }

    @Test
    public void oboeHasName(){
        assertEquals("Contrabass", oboe1.getInstrumentName());
    }

    @Test
    public void oboeHasBoughtPrice(){
        assertEquals(750, oboe1.getBoughtPrice(), 0.1);
    }

    @Test
    public void oboeHasSellPrice(){
        assertEquals(1000, oboe1.getSellPrice(), 0.1);
    }

    @Test
    public void oboeHasInstrumentType(){
        assertEquals(InstrumentType.WOODWIND, oboe1.getInstrumentType());
    }

    @Test
    public void oboeCanPlay(){
        assertEquals("I am the echo in Berlioz Symphonie Fantastique!", oboe1.play());
    }

    @Test
    public void oboeHasMarkUp(){
        assertEquals(250, oboe1.calculateMarkup(), 0.1);
    }

}
