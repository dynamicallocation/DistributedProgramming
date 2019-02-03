import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;


public class schedulerTest {

    @Test
    public void doesSwitchBulb() throws Exception
    {
       scheduler sc = new scheduler();
       String state = sc.defaultBulb();
       assertTrue(state.equals("On"));
       state = sc.switchBulb();
       assertTrue(state.equals("Off"));
       state = sc.switchBulb();
       assertTrue(state.equals("On"));

    }

    @Test
    public void doesSwitchOutlet() throws Exception
    {
        scheduler sc = new scheduler();
        outlet outlet = new outlet();
        String[] states = sc.defaultPower();
        assertTrue(states[0].equals("On"));
        states = sc.switchPower(0);
        assertTrue(states[0].equals("Off"));



    }



}