package musicshop;

import behaviours.ISell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Piano piano;
    ISell item;
    ISell item2;

    @Before
    public void before(){
        shop = new Shop("Ray's Music Exchange",3500);
        item = new Guitar("Blue","String", 1599, 1799, "Gibson Les Paul", 6);
        item2 = new sheetMusic("Piano Book for Adult Beginners", 12, 15);
    }

    @Test
    public void hasName(){
        assertEquals("Ray's Music Exchange", shop.getName());
    }

    @Test
    public void hasCash(){
        assertEquals(3500, shop.getCash());
    }

    @Test
    public void stockStartsEmpty(){
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canAddToStock(){
        shop.addStock(item);
        shop.addStock(item2);
        assertEquals(2, shop.stockCount());
    }

    @Test
    public void canAddPianoToStock(){
        piano = new Piano("Brown", "Piano", 1500,1800,"Roland RP701");
        shop.addStock(item);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canRemoveFromStock(){
        shop.addStock(item);
        shop.removeFromStock(item);
        assertEquals(0, shop.stockCount());
    }

}
