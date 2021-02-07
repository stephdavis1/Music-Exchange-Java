package musicshop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Blue","String", 1599, 1799, "Gibson Les Paul", 6);
    }

    @Test
    public void hasColour() {
        assertEquals("Blue", guitar.getColour());
    }

    @Test
    public void hasSetColour(){
        guitar.setColour("Red");
        assertEquals("Red", guitar.getColour());
    }

    @Test
    public void hasType(){
        assertEquals("String", guitar.getType());
    }

    @Test
    public void hasSetType(){
        guitar.setType("Electric");
        assertEquals("Electric", guitar.getType());
    }

    @Test
    public void canGetModel(){
        assertEquals("Gibson Les Paul", guitar.getModel());
    }

    @Test
    public void canSetModel(){
        guitar.setModel("Gibson S5");
        assertEquals("Gibson S5", guitar.getModel());
    }

    @Test
    public void canGetNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void canSetNumberOfStrings(){
        guitar.setNumberOfStrings(7);
        assertEquals(7, guitar.getNumberOfStrings());
    }

    @Test
    public void canPlay(){
        assertEquals("Rock on!", guitar.play());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(1799, guitar.getSellPrice());
    }

    @Test
    public void hasSetSellPrice(){
        guitar.setSellPrice(1899);
        assertEquals(1899, guitar.getSellPrice());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(1599, guitar.getBuyPrice());
    }

    @Test
    public void hasSetBuyPrice(){
        guitar.setBuyPrice(1699);
        assertEquals(1699, guitar.getBuyPrice());
    }

    @Test
    public void canGetMarkUp(){
        assertEquals(200, guitar.calculateMarkup());
    }

}
