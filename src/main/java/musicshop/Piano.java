package musicshop;

public class Piano extends Instrument {

    private String manufacturer;

    public Piano(String colour, String type, int buyPrice, int sellPrice, String manufacturer) {
        super(colour, type, buyPrice, sellPrice);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer(){
        return this.manufacturer;
    }

    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }

    public String play(){
        return "plink";
    }

    public int calculateMarkup(){
        return this.sellPrice - this.buyPrice;
    }
}
