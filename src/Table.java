import java.util.ArrayList;
import java.util.Scanner;


public class Table implements tb
{

    private ArrayList<devices> tbArray = new ArrayList<>();
    private ArrayList<String> column = new ArrayList<>();
    private StringBuilder row = new StringBuilder();
    private scheduler sc = new scheduler();
    private String deviceState;
    Scanner scanner = new Scanner(System.in);

    @Override
    public void displayTable() {

        System.out.println(column.toString().substring(1, column.toString().length() - 1));

    }

    @Override
    public int getSize() {
        return tbArray.size();
    }

    @Override
    public void editTable(int id,String deviceModel,String deviceType,String deviceColor,String deviceBrightness) {

        if(deviceType.equalsIgnoreCase("outlet"))
        {
            editOutlet(id,deviceModel,deviceType,deviceColor,deviceBrightness);
        }
        else {
            editBulb(id,deviceModel,deviceType,deviceColor,deviceBrightness);
        }

    }

    @Override
    public void clear() {

        tbArray.clear();
    }

    @Override
    public void editBulb(int id, String deviceModel, String deviceType, String deviceColor,String deviceBrightness) {
        tbArray.set(id,new devices(Integer.toString(id), deviceModel, deviceType, deviceColor, deviceBrightness,sc.defaultBulb()));
        /*System.out.println(Integer.toString(id));
        System.out.println(tbArray.get(id).getModel());
        System.out.println(tbArray.get(id).getType());
        System.out.println(tbArray.get(id).getColor());
        System.out.println(tbArray.get(id).getBrightness());*/
        //test return values
        setBulb(id,true);

    }



    @Override
    public void editOutlet(int id,String deviceModel,String deviceType,String deviceColor,String deviceBrightness) {
        tbArray.set(id,new devices(Integer.toString(tbArray.size()), deviceModel, deviceType, deviceColor, deviceBrightness,sc.defaultBulb()));
        setBulb(id,true);
    }

    @Override
    public void addDevice(String deviceModel,String deviceType,String deviceColor,String deviceBrightness,int id) {


        if(deviceType.equalsIgnoreCase("bulb")) {


            tbArray.add(new devices(Integer.toString(tbArray.size()), deviceModel, deviceType, deviceColor, deviceBrightness,sc.defaultBulb()));
            setBulb(id,false);
        }
        else if(deviceType.equalsIgnoreCase("outlet")) {


            scheduler sc = new scheduler();
            tbArray.add(new devices(Integer.toString(tbArray.size()), deviceModel, deviceType, deviceColor, deviceBrightness, sc.defaultPower()));
            setOutlet(id,false);

        }
        else
        {
            tbArray.add(new devices(Integer.toString(tbArray.size()), deviceModel, deviceType, deviceColor, deviceBrightness, sc.defaultBulb()));
        }

    }

    @Override
    public void setBulb(int id,boolean isEdit)
    {
        if(isEdit)
        {
            row.append("Id: " + tbArray.get(id).getId() + " ");
            row.append("Color: " +tbArray.get(id).getColor() + " ");
            row.append("Type: " +tbArray.get(id).getType() + " ");
            row.append("Brightness: " + tbArray.get(id).getBrightness() + " ");
            row.append("Model: " + tbArray.get(id).getModel() + " ");
            row.append("State: " + tbArray.get(id).getState() + " ");
            row.append("\n");
            column.set(id,row.toString());
            row.setLength(0);
        }
        else {
            row.append("Id: " + tbArray.get(id).getId() + " ");
            row.append("Color: " + tbArray.get(id).getColor() + " ");
            row.append("Type: " + tbArray.get(id).getType() + " ");
            row.append("Brightness: " + tbArray.get(id).getBrightness() + " ");
            row.append("Model: " + tbArray.get(id).getModel() + " ");
            row.append("State: " + tbArray.get(id).getState() + " ");
            row.append("\n");
            column.add(id, row.toString());
            row.setLength(0);
        }

    }

    public void setOutlet(int id, boolean isEdit)
    {
        row.append("Id: " + tbArray.get(id).getId() + " ");
        row.append("Color: " + tbArray.get(id).getColor() + " ");
        row.append("Type: " + tbArray.get(id).getType() + " ");
        row.append("Brightness: " + tbArray.get(id).getBrightness() + " ");
        row.append("Model: " + tbArray.get(id).getModel() + " ");
        String[] states = tbArray.get(id).getStates();
        for(int i = 0; i < states.length;i++)
        {
            row.append(" Switch" + Integer.toString(i) + ":" + states[i]);
        }
        column.add(id,row.toString());
        row.setLength(0);
    }

    public void switchBulb(int id)
    {

            tbArray.get(id).setState(sc.switchBulb());
            row.append("Id: " + tbArray.get(id).getId() + " ");
            row.append("Color: " + tbArray.get(id).getColor() + " ");
            row.append("Type: " + tbArray.get(id).getType() + " ");
            row.append("Brightness: " + tbArray.get(id).getBrightness() + " ");
            row.append("Model: " + tbArray.get(id).getModel() + " ");
            row.append("State: " + tbArray.get(id).getState() + " ");
            row.append("\n");
            column.set(id, row.toString());
            row.setLength(0);

    }

    public void switchPower(int id)
    {

        row.append("Id: " + tbArray.get(id).getId() + " ");
        row.append("Color: " + tbArray.get(id).getColor() + " ");
        row.append("Type: " + tbArray.get(id).getType() + " ");
        row.append("Brightness: " + tbArray.get(id).getBrightness() + " ");
        row.append("Model: " + tbArray.get(id).getModel() + " ");
        String[] states = tbArray.get(id).getStates();
        for(int i = 0; i < states.length; i++)
        {
            row.append("Switch" + Integer.toString(i) + ": " + states[i]);
        }
        column.set(id,row.toString());
        row.setLength(0);

    }

    public void switchDevice(int id)
    {
        if(tbArray.get(id).getType().equalsIgnoreCase("outlet"))
        {
            System.out.println("enter switch that you would like to turn off");
            int outlet = scanner.nextInt();
            String[] newState = sc.switchPower(outlet);
            tbArray.get(id).setStates(newState);
            switchPower(id);
        }
        else {

            switchBulb(id);
        }

    }



    @Override
    public void removeDevice(int id)
    {
        column.remove(id);
    }








}