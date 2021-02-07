package musicshop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Brown", "Piano", 1500,1800,"Roland RP701");
    }

    @Test
    public void canGetManufacturer(){
        assertEquals("Roland RP701", piano.getManufacturer());
    }

    @Test
    public void canSetManufacturer(){
        piano.setManufacturer("Yamaha YDP-144");
        assertEquals("Yamaha YDP-144", piano.getManufacturer());
    }

    @Test
    public void hasColour(){
        assertEquals("Brown", piano.getColour());
    }

    @Test
    public void setColour(){
        piano.setColour("Black");
        assertEquals("Black",piano.getColour());
    }

    @Test
    public void hasType(){
        assertEquals("Piano", piano.getType());
    }

    @Test
    public void setType(){
        piano.setType("Keyboard");
        assertEquals("Keyboard", piano.getType());
    }

    @Test
    public void canPlay(){
        assertEquals("plink", piano.play());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(1800, piano.getSellPrice());
    }

    @Test
    public void hasSetSellPrice(){
        piano.setSellPrice(1900);
        assertEquals(1900, piano.getSellPrice());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(1500, piano.getBuyPrice());
    }

    @Test
    public void hasSetBuyPrice(){
        piano.setBuyPrice(1600);
        assertEquals(1600, piano.getBuyPrice());
    }

    @Test
    public void canGetMarkUp(){
        assertEquals(300, piano.calculateMarkup());
    }
}
