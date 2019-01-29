package main.java;

import com.oracle.tools.packager.Log;

public class outlet implements device
{
    //device is assumed to be off when instantiated

    private boolean state = false;
    private int id = 0;
    private int group = 0;

    public void outlet(boolean state, int id, int group)
    {
        this.state = state;
    }

    @Override
    public void switchState()
    {
        status = !status;
    }
    
    @Override
    public void updateGroup(int group)
    {
        this.group = group;
    }

    public boolean getState()
    {
        return status;
    }
    
    public boolean getFullState()
    {
        return status + id + group;
    }

}

