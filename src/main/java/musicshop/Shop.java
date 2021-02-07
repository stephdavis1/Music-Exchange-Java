package musicshop;

import behaviours.ISell;

import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<ISell> stock;
    private int cash;

    public Shop(String name, int cash){
        this.name = name;
        this.cash = cash;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCash() {
        return cash;
    }

    public int stockCount(){
        return this.stock.size();
    }

    public void addStock(ISell item){
        this.stock.add(item);
    }

    public void removeFromStock(ISell item){
        this.stock.remove(item);
    }

}
