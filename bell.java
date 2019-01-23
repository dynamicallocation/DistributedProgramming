package main.java;

import com.oracle.tools.packager.Log;

public class bell implements device
{
    //device is assumed to be on when instantiated
    
    private boolean status = false;
    private int id = 0;
    private int group = 0;
    
    public void bell(boolean status)
    {
        this.status = status;
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

