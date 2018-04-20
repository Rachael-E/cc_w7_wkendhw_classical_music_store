import Accessories.Reed;
import Behaviours.ISellable;
import InstrumentType.InstrumentType;
import Instruments.Clarinet;
import Instruments.Instruments;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop1;
    private ArrayList<ISellable> stock;
    private Clarinet clarinet1;
    private Reed reed1;

    @Before
    public void before(){
        clarinet1 = new Clarinet("B Flat", 750, 1000, InstrumentType.WOODWIND);
        reed1 = new Reed("Rico", 3.50, 5.00, "reeds for woodwind mouthpieces", InstrumentType.WOODWIND);
        stock = new ArrayList<>();
        stock.add(clarinet1);
        stock.add(reed1);
        shop1 = new Shop ("Ray's Classical Compendium", stock, 200 );
    }


    @Test
    public void shopHasName(){
        assertEquals("Ray's Classical Compendium", shop1.getName());
    }

    @Test
    public void shopHasTill(){
        assertEquals(200, shop1.getTill(), 0.01);
    }

    @Test
    public void shopHasStock(){
        assertEquals(2, shop1.getStock().size());
    }

}
