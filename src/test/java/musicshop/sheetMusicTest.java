package musicshop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class sheetMusicTest {

    sheetMusic sheet;

    @Before
    public void before(){
        sheet = new sheetMusic("Piano Book for Adult Beginners", 12, 15);
    }

    @Test
    public void hasTitle(){
        assertEquals("Piano Book for Adult Beginners", sheet.getTitle());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(12, sheet.getBuyPrice());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(15, sheet.getSellPrice());
    }

    @Test
    public void canGetMarkUp(){
        assertEquals(3, sheet.calculateMarkup());
    }
}
