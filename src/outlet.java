

public class outlet
{

    //device is assumed to be on when instantiated


    private boolean state;
    private boolean[] states = new boolean[11];

    public outlet(boolean state)
    {
        for(int i = 0; i < states.length; i++)
        {
            states[i] = state;
        }
        this.state = state;

    }



    public void switchState(int outlet)
    {
        states[outlet] = !state;
    }

    public boolean[] getStates()
    {
        return states;
    }












}