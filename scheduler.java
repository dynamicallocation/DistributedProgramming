package main.java;
import java.util.Timer;
import java.util.TimerTask;

public class scheduler {

    private bulb lightBulb;
    private outlet powerStrip;

    public scheduler()
    {
        lightBulb = new bulb();
        System.out.println(lightBulb.getState()? "On" : "Off");
        powerStrip = [new outlet(), new outlet()];
        System.out.println(powerStrip[0].getState()? "On" : "Off", powerStrip[1].getState()? "On" : "Off");
    }
    
    private static Date getDate(int hour, int minute, int second)
    {
        Calendar today = Calendar.getInstance();
        today.set(Calendar.HOUR_OF_DAY, hour);
        today.set(Calendar.MINUTE, minute);
        today.set(Calendar.SECOND, second);
        
        return today;
    }
    
    public void schedule(Date date, Callable<T> func)
    {
        Timer timer = new Timer();
        timer.schedule(func.call(), today.getTime(), TimeUnit.MILLISECONDS.convert(1, TimeUnit.DAYS));
    }

    public void switchPower()
    {
        powerStrip.switchState();
        System.out.println(powerStrip.getState()? "On" : "Off");
    }

    public void switchBulb()
    {
        powerStrip.switchState();
        System.out.println(powerStrip.getState()? "On" : "Off");
    }


    public String defaultPower()
    {
        return powerStrip.getState()? "On" : "Off";
    }

    public String defaultBulb()
    {
        return lightBulb.getState()? "On" : "Off";
    }


    public String switchPower()
    {
        powerStrip.switchState();
        return powerStrip.getState()? "On" : "Off";
    }

    public String switchBulb()
    {
        lightBulb.switchState();
        return lightBulb.getState()? "On" : "Off";
    }

}
