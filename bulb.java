package main.java;
import com.oracle.tools.packager.Log;

public class bulb implements device
{
    //device is assumed to be off when instantiated

    private boolean status = false;
    private int id = 0;
    private int group = 0;
    private int dim = 0;
    private int[] color = {0,0,255};

    public void bulb(boolean status, int id, int group, int dim, int[] color)
    {
        this.status = status;
        this.id = id;
        this.group = group;
        this.dim = dim;
        this.color = color;
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
    
    @Override
    public void updateDim(int dim)
    {
        this.dim = dim;
    }
    
    @Override
    public void updateColor(int color0, int color1, int color2)
    {
        int[] data = {color0, color1, color2};
        data = color;
    }

    public boolean getState()
    {
        return state;
    }

    public boolean getFullState()
    {
        return status + id + group + dim + color;
    }

}
