

public class bulb implements device
{

    //device is assumed to be on when instantiated

    private boolean state = true;

    public void outlet(boolean state)
    {
        this.state = state;
    }

    @Override
    public void switchState()
    {
        state = !state;
    }

    public boolean getState()
    {
        return state;
    }





}