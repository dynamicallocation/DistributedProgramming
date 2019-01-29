package main.java;

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
