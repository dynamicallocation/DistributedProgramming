package main.java;

public class Table {

    private String deviceModel;
    private String deviceType;
    private String deviceState;
    private String deviceColor;


    public Table(String deviceModel, String deviceType, String deviceState, String deviceColor)
    {
        this.deviceModel = deviceModel;
        this.deviceType = deviceType;
        this.deviceState = deviceState;
        this.deviceColor = deviceColor;
        this.deviceState = deviceState;
    }

    public Table()
    {

    }

    public void displayTable()
    {

       displayHeader();



    }

    private void displayHeader() {

        System.out.println("\nModel|State|Brightness|Other");
        System.out.println("----------------------------");
    }

    public void updateTable()
    {
        //Todo
        //update Table
    }

    public void removeFromTable()
    {

    }

    public void addToTable()
    {

    }

    public void editTable()
    {

    }

}
