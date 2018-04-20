import Accessories.Reed;
import Behaviours.ISellable;
import InstrumentType.InstrumentType;
import Instruments.Clarinet;
import Instruments.FrenchHorn;
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
    private FrenchHorn frenchHorn1;

    @Before
    public void before(){
        clarinet1 = new Clarinet("B Flat", 750, 1000, InstrumentType.WOODWIND);
        reed1 = new Reed("Rico", 3.50, 5.00, "reeds for woodwind mouthpieces", InstrumentType.WOODWIND);
        frenchHorn1 = new FrenchHorn("Yamaha", 800, 1200, InstrumentType.BRASS);
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

    @Test
    public void shopCanTryInstrument(){
        assertEquals("I am the main star of Gerschwin, Rhapsody in Blue!", shop1.demonstrateAnInstrument(clarinet1));
    }

    @Test
    public void shopCanAddStock(){
        shop1.addStock(frenchHorn1);
        assertEquals(3, shop1.getStock().size());
    }

    @Test
    public void shopSoldStockStartsEmpty(){
        assertEquals(0, shop1.getSoldStock().size());
    }

    @Test
    public void shopCanSell(){
        shop1.sellStock();
        assertEquals(1, shop1.getStock().size());
        assertEquals(reed1.getClass(), shop1.getStock().get(0).getClass());
    }

    @Test
    public void shopCanTrackSoldItems(){
        shop1.addStock(frenchHorn1);
        shop1.takeFromStockAddToSellStock(clarinet1);
        assertEquals(2, shop1.getStock().size());
        assertEquals(1, shop1.getSoldStock().size());
        assertEquals("B Flat", shop1.checkSoldStockName());
        assertEquals("Rico", shop1.checkStockName());
    }

    @Test
    public void shopCanAddCashToTillWhenSelling(){
        shop1.addCashToTill(clarinet1);
        assertEquals(1, shop1.getStock().size());
        assertEquals(1200, shop1.getTill(), 0.1);
    }

    @Test
    public void shopCanGetPotentialProfitFromItemsInStock(){
        assertEquals(251.5, shop1.potentialProfitFromStock(), 0.01);
    }

    @Test
    public void shopProfitFromSold(){
        shop1.addStock(frenchHorn1);
        shop1.takeFromStockAddToSellStock(clarinet1);
        shop1.takeFromStockAddToSellStock(reed1);
        assertEquals(251.50, shop1.profitFromSoldItems(), 0.01);
        assertEquals(400, shop1.potentialProfitFromStock(), 0.01);
    }

}
