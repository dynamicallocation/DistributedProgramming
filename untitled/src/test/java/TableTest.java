import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TableTest {


    @Test
    public void isAdded() throws Exception
    {
        Table tb = new Table();
        scheduler sc = new scheduler();
        assertEquals(0,tb.getSize());
        tb.addDevice("f18","bulb","red%","40%",0);
        assertEquals(1,tb.getSize());

    }

    @Test
    public void isRemoved() throws Exception
    {
        Table tb = new Table();
        scheduler sc = new scheduler();
        assertEquals(0,tb.getSize());
        tb.addDevice("f18","bulb","red%","40%",0);
        assertEquals(1,tb.getSize());
        tb.removeDevice(0);
        assertEquals(0,tb.getSize());

    }

    @Test
    public void isEdited() throws Exception
    {
        Table tb = new Table();
        ArrayList<devices> device = tb.getarry();

        assertEquals(0,tb.getSize());
        tb.addDevice("f18","bulb","red","40%",0);
        tb.editBulb(0,"f77","bulb","red","50%");
        assertEquals("f77",device.get(0).getModel());

    }




}