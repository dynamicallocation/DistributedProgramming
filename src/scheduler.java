
public class scheduler {

    private bulb lightBulb;
    private outlet powerStrip;

    public scheduler()
    {
        lightBulb = new bulb();
        powerStrip = new outlet(true);

    }


    public String[] defaultPower()
    {
        boolean[] states = powerStrip.getStates();
        String[] switchState = new String[states.length];
        for(int i = 0; i < states.length;i++)
        {
            switchState[i] = states[i]? "On" : "Off";
        }
        return switchState;
    }

    public String defaultBulb()
    {
        return lightBulb.getState()? "On" : "Off";
    }


    public String[] switchPower(int outlet)
    {
        powerStrip.switchState(outlet);
        boolean[] states = powerStrip.getStates();
        String[] switchState = new String[states.length];
        for(int i = 0; i < states.length;i++)
        {
            switchState[i] = states[i]? "On" : "Off";
        }
        return switchState;
    }


    public String switchBulb()
    {
        lightBulb.switchState();
        return lightBulb.getState()? "On" : "Off";
    }











}
