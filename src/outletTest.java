import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class outletTest {


    @Test
    public void outletSize() throws Exception
    {
        outlet outlet = new outlet();
        assertEquals(11,outlet.getStates().length);
    }

    @Test
    public void switchOutlet() throws Exception
    {
        outlet outlet = new outlet();
        boolean[] outlets = outlet.getStates();
        assertEquals(true,outlets[5]);
        outlet.switchState(5);
        assertEquals(false,outlets[5]);
        outlet.switchState(5);
        assertEquals(true,outlets[5]);
    }






}