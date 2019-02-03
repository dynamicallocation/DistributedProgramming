

public class outlet
{

    //device is assumed to be on when instantiated



    private boolean[] states = new boolean[7];
    private boolean state = true;
    private int count = 0;


    public outlet()
    {

        for(int i = 0; i < states.length; i++)
        {
            states[i] = state;
        }

    }


    public void switchState(int outlet)
    {

        count++;
        states[outlet] = getState(count);
    }

    public boolean[] getStates()
    {
        return states;
    }

    public boolean getState(int count)
    {
        return count % 2 == 0? true : false;
    }














}