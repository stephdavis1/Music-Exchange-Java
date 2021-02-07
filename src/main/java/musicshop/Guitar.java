package musicshop;

public class Guitar extends Instrument {

    private String model;
    private int numberOfStrings;

    public Guitar(String colour, String type, int buyPrice, int sellPrice, String model, int numberOfStrings) {
        super(colour, type, buyPrice, sellPrice);
        this.model = model;
        this.numberOfStrings = numberOfStrings;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public int getNumberOfStrings(){
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public String play(){
        return "Rock on!";
    }

    public int calculateMarkup(){
        return this.sellPrice - this.buyPrice;
    }
}
