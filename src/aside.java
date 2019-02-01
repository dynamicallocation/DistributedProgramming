/*import java.util.ArrayList;
import java.util.Iterator;

public class Table {


    private ArrayList<devices> tbArray = new ArrayList<>();
    private ArrayList<String> column = new ArrayList<>();
    private StringBuilder tableBuilder = new StringBuilder();
    private scheduler sc = new scheduler();
    private String deviceState;

    public void displayTable()
    {
        System.out.println(column.toString());
    }


    public int getSize()
    {
        return tbArray.size();
    }


    public void removeFromTable(int id)
    {
        tbArray.remove(id);
    }

    public void addToTable(String deviceModel,String deviceType,String deviceColor,String deviceBrightness,int id)
    {
              tbArray.add(new devices(Integer.toString(tbArray.size()),deviceModel,deviceType,deviceBrightness,deviceColor,sc.defaultBulb()));
              if(deviceType.equals("outlet"))
              {
                  editOutlet(id);
              }
              displayTable();
    }

    public void editTable(String deviceModel,String deviceType,String deviceColor,String deviceBrightness,int id)
    {

           tbArray.set(id,new devices(Integer.toString(tbArray.size()),deviceModel,deviceType,deviceBrightness,deviceColor,sc.defaultBulb()));
           if(deviceType.equals("phone"))
           {
               editPhone(id,false,true);
               displayTable();
           }
           else {
               editOutlet(id);
               displayTable();
           }
    }

    public void editTable(int id)
    {

        if(tbArray.get(id).getType().equals("Phone"))
        {
            editPhone(id,true,false);
        }
        displayTable();
    }

    public void clearTable()
    {
        tbArray.clear();
    }


    public void removeAll(int id)
    {
        column.remove(tbArray.get(id).getId());
        column.remove(tbArray.get(id).getColor());
        column.remove(tbArray.get(id).getType());
        column.remove(tbArray.get(id).getBrightness());
        column.remove(tbArray.get(id).getModel());
        column.remove(tbArray.get(id).getState());
        column.remove(0);
    }

    public void editPhone(int id,boolean switchState,boolean edit)
    {


        if(switchState) {
            removeAll(id);
            tbArray.get(id).setState(sc.switchBulb());
            column.add(tbArray.get(id).getId());
            column.add(tbArray.get(id).getColor());
            column.add(tbArray.get(id).getType());
            column.add(tbArray.get(id).getBrightness());
            column.add(tbArray.get(id).getModel());
            column.add(tbArray.get(id).getState());
            column.add("\n");
            System.out.println(column.toString());
        }
        else if(edit)
        {
            removeAll(id);
            column.add(tbArray.get(id).getId());
            column.add(tbArray.get(id).getColor());
            column.add(tbArray.get(id).getType());
            column.add(tbArray.get(id).getBrightness());
            column.add(tbArray.get(id).getModel());
            column.add(tbArray.get(id).getState());
            column.add("\n");
            System.out.println(column.toString());

        }

        else{
        System.out.println("adding");
        if (tbArray.size() == 0) {
            System.out.println("No Devices Available");
        } else {


            column.add(tbArray.get(id).getId());
            column.add(tbArray.get(id).getColor());
            column.add(tbArray.get(id).getType());
            column.add(tbArray.get(id).getBrightness());
            column.add(tbArray.get(id).getModel());
            column.add(tbArray.get(id).getState());
            column.add("\n");

            System.out.println(column.toString());

        }
    }

    }

    public void editOutlet(int id)
    {

        if (tbArray.size() == 0) {
            System.out.println("No Devices Available");
        } else {


            column.add(tbArray.get(id).getId());
            column.add(tbArray.get(id).getColor());
            column.add(tbArray.get(id).getType());
            column.add(tbArray.get(id).getBrightness());
            column.add(tbArray.get(id).getModel());
            column.add(tbArray.get(id).getState());
            column.add("\n");

            System.out.println(column.toString());

            System.out.println(column.toString());

        }
    }

    }*/



