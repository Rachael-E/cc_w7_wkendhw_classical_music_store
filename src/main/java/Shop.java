import Behaviours.IPlayable;
import Behaviours.ISellable;
import Instruments.Clarinet;
import Instruments.Instruments;

import javax.sound.midi.Instrument;
import java.util.ArrayList;

public class Shop {

    private String name;
    //private Instruments instrument;
    private ISellable sellableItems;
    private ArrayList<ISellable> stock;
    //private IPlayable tryOutInstrument;
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

    public void addStock(ISellable itemToAdd){
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

    public void takeFromStockAddToSellStock(ISellable itemToAdd){
        sellStock(itemToAdd);
        soldStock.add(itemToAdd);
    }

    public void sellStock(ISellable itemToSell){
        stock.remove(0);
    }

    // I want to see what the name of the object is at index 0 in the soldStock arraylist
//    public String checkStockTypeInIndex0(ArrayList stock){
//
//        return getSoldStock().get(0).
//    }

    public void addCashToTill(Instruments instrumentSold) {
        takeFromStockAddToSellStock(instrumentSold);
        double cash = instrumentSold.getSellPrice();
        this.till = cash += getTill();
    }

    public double potentialProfitFromStock(){
        return stock.get(0).calculateMarkup() + stock.get(1).calculateMarkup();
    }

    public double profitFromSoldItems(){
        return soldStock.get(0).calculateMarkup();
    }
}
