import Behaviours.IPlayable;
import Behaviours.ISellable;
import Instruments.Clarinet;
import Instruments.Instruments;
import Accessories.*;

import javax.sound.midi.Instrument;
import java.util.ArrayList;

public class Shop {

    private String name;
    private ISellable sellableItems;
    private ArrayList<ISellable> stock;
    private ArrayList<ISellable> soldStock;
    private double till;

    public Shop(String name, ArrayList<ISellable> stock, double till) {
        this.name = name;
        this.stock = stock;
        this.till = till;
        this.soldStock = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<ISellable> getStock() {
        return stock;
    }

    public void addStock(ISellable itemToAdd) {
        stock.add(itemToAdd);
    }

    public String demonstrateAnInstrument(IPlayable instrumentToDemonstrate) {
        return instrumentToDemonstrate.play();
    }

    public ArrayList<ISellable> getSoldStock() {
        return soldStock;
    }

    public double getTill() {
        return till;
    }

    public void takeFromStockAddToSellStock(ISellable itemToAdd) {
        sellStock();
        soldStock.add(itemToAdd);
    }

    public void sellStock() {
        stock.remove(0);
    }

    public void addCashToTill(Instruments instrumentSold) {
        takeFromStockAddToSellStock(instrumentSold);
        double cash = instrumentSold.getSellPrice();
        this.till = cash += getTill();
    }

    public double potentialProfitFromStock() {
        double potentialProfit = 0;

        for (int i = 0; i < stock.size(); i++) {
            potentialProfit += stock.get(i).calculateMarkup();
        }

        return potentialProfit;

    }

    public double profitFromSoldItems() {

        double profit = 0;

        for (int i = 0; i < soldStock.size(); i++){
            profit += soldStock.get(i).calculateMarkup();
        }

        return profit;
    }

// returns a string of instrument name for the ISellable found in soldStock array: but only if the item sold is an instrument. This won't work if the item is an accessory.
    public String checkSoldStockName(){
        Instruments instrument = (Instruments) getSoldStock().get(0);

        return instrument.getInstrumentName();

    }

    // returns a string of accessory name for the ISellable found in Stock array: but only if the item in the stock is an accessory. This won't work if the item is an instrument.

    public String checkStockName(){
       Accessory accessory = (Accessory) getStock().get(0);

       return accessory.getName();

//        if (getStock().get(0).getClass() == Instruments){
//
//        Instruments instrument = (Instruments) getStock().get(0);
//
//        return instrument.getInstrumentName()};
//
//        else if (getStock().get(0).getClass() == Instruments)
//            return acce

    }


}
