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

}
