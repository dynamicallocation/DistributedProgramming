public class devices
{
    private String id;
    private String color;
    private String model;
    private String type;
    private String brightness;
    private String state;
    private String[] states;

    public devices(String id, String model, String type, String brightness, String color, String state)
    {
        this.id = id;
        this.model = model;
        this.type = type;
        this.brightness = brightness;
        this.color = color;
        this.state = state;
    }

    public devices(String id, String model, String type, String brightness, String color, String[] states)
    {
        this.id = id;
        this.model = model;
        this.type = type;
        this.brightness = brightness;
        this.color = color;
        this.states = states;
    }

    public String getId()
    {
        return id;
    }

    public String getModel()
    {
        return model;
    }

    public String getType()
    {
        return type;
    }

    public String getBrightness()
    {
        return brightness;
    }

    public String getColor()
    {
        return color;
    }

    public String getState()
    {
         return state;
    }

    public String[] getStates()
    {
        return states;
    }

    public void setStates(String[] states)
    {
        this.states = states;
    }


    public void setState(String state)
    {
        this.state = state;
    }

}