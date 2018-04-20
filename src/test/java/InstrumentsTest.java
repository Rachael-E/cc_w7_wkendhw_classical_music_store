import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentsTest {

    private Clarinet clarinet1;
    private Oboe oboe1;

    @Before
    public void before() {
        clarinet1 = new Clarinet("B Flat", 750, 1000, InstrumentType.CLARINET);
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
        assertEquals(InstrumentType.CLARINET, clarinet1.getInstrumentType());
    }

    @Test
    public void clarinetCanPlay(){
        assertEquals("I am the main star of Gerschwin, Rhapsody in Blue!", clarinet1.play());
    }

    @Test
    public void clarinetHasMarkUp(){
        assertEquals(250, clarinet1.calculateMarkup(), 0.1);
    }

}
