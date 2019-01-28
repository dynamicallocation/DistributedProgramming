package main.java;


import com.oracle.tools.packager.Log;

public class outlet implements device
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