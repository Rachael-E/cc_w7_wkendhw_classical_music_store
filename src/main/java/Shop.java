import Behaviours.IPlayable;
import Behaviours.ISellable;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISellable> stock;
    private IPlayable tryOutInstrument;
    private ArrayList<ISellable> soldStock;
    private double till;

    public Shop(String name, ArrayList<ISellable> stock, double till) {
        this.name = name;
        this.stock = stock;
        this.till = till;
    }

    public String getName() {
        return name;
    }

    public ArrayList<ISellable> getStock() {
        return stock;
    }

    public IPlayable getTryOutInstrument() {
        return tryOutInstrument;
    }

    public ArrayList<ISellable> getSoldStock() {
        return soldStock;
    }

    public double getTill() {
        return till;
    }

    public void setStock(ArrayList<ISellable> stock) {
        this.stock = stock;
    }

    public void setSoldStock(ArrayList<ISellable> soldStock) {
        this.soldStock = soldStock;
    }

    public void addCashToTill(double cash) {
        this.till = cash += getTill();
    }
}
