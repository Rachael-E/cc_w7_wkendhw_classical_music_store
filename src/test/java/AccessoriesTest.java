import Accessories.CleaningCloth;
import Accessories.Reed;
import InstrumentType.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccessoriesTest {

    private Reed reed1;
    private CleaningCloth cloth1;

    @Before
    public void before(){
        reed1 = new Reed("Rico", 3.50, 5.00, "reeds for woodwind mouthpieces", InstrumentType.WOODWIND);
        cloth1 = new CleaningCloth("Microcloth", 2, 3.50, "cloth for polishing instruments");
    }

    @Test
    public void reedHasName(){
        assertEquals("Rico", reed1.getName());
    }

    @Test
    public void clothHasName(){
        assertEquals("Microcloth", cloth1.getName());
    }

    @Test
    public void reedHasMarkUp(){
        assertEquals(1.50, reed1.calculateMarkup(), 0.01);
    }

    @Test
    public void clothHasMarkUp(){
        assertEquals(1.50, cloth1.calculateMarkup(), 0.01);
    }

    @Test
    public void reedHasInstrumentType(){
        assertEquals(InstrumentType.WOODWIND, reed1.getInstrumentType());
    }
}
