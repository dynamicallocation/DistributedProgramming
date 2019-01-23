package main.java;

public class scheduler {

    private bulb lightBulb;
    private outlet powerStrip;

    public scheduler()
    {
        lightBulb = new bulb();
        System.out.println(lightBulb.getState()? "On" : "Off");
        powerStrip = new outlet();
        System.out.println(powerStrip.getState()? "On" : "Off");
        //Devices are ON upon instantiation
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





}
