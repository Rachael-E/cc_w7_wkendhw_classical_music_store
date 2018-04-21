import Behaviours.IPlayable;
import Behaviours.ISellable;

import java.util.ArrayList;

public class Shop {

    private String name;
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

    public void addCashToTill(ISellable instrumentSold) {
        takeFromStockAddToSellStock(instrumentSold);
        double cash = instrumentSold.getSellPrice();
        till = cash + getTill();
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

        for (int i = 0; i < soldStock.size(); i++) {
            profit += soldStock.get(i).calculateMarkup();
        }

        return profit;
    }

    public String getNameOfFirstItemInStock() {
        return getStock().get(0).getName();
    }
// this is nice but isn't neat as it adds a comma at the end of the array list?
    public String getNamesOfAllItemsInStock() {
        String stockNames = "Items in stock: ";

        for (int i = 0; i < stock.size(); i++) {
            stockNames += "'" + getStock().get(i).getName() + "'";
        }
        return stockNames;
    }

    // complete by writing a for loops to get all names of items in stock
    public String getNameOfFirstItemInSoldStock() {
        return getSoldStock().get(0).getName();
    }

    public String getNamesOfAllItemsInSoldStock() {
        String soldStockNames = "Items sold: ";
        for (int i = 0; i < soldStock.size(); i++){
            soldStockNames += "'" + getSoldStock().get(i).getName() + "'";
        }

        return soldStockNames;
    }

}





    /// Examples of Casting: redundant now that ISellable enforces a getName method.
    // returns a string of instrument name for the ISellable found in soldStock array: but only if the item sold is an instrument. This won't work if the item is an accessory.
//    public String getNameOfFirstSoldItem(){
//        Instruments instrument = (Instruments) getSoldStock().get(0);
//
//        return instrument.getInstrumentName();
//
//    }

    // returns a string of accessory name for the ISellable found in Stock array: but only if the item in the stock is an accessory. This won't work if the item is an instrument.

//    public String checkNameOfFirstItemInStock(){
//        Accessory accessory = (Accessory) getStock().get(0);
//
//        return accessory.getName();
//    }



