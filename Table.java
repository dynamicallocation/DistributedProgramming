package main.java;

import java.util.ArrayList;
import java.util.Iterator;

public class Table {


    private ArrayList<devices> tbArray = new ArrayList<>();
    private ArrayList<String> column = new ArrayList<>();
    private StringBuilder tableBuilder = new StringBuilder();
    private scheduler sc = new scheduler();
    private String deviceState;

    public void displayTable(int id,boolean replace)
    {

        if(!replace) {
            System.out.println("adding");
            if (tbArray.size() == 0) {
                System.out.println("No Devices Available");
            } else {

                tableBuilder.append(tbArray.get(id).getId());
                tableBuilder.append("|");
                tableBuilder.append(tbArray.get(id).getColor());
                tableBuilder.append("|");
                tableBuilder.append(tbArray.get(id).getType());
                tableBuilder.append("|");
                tableBuilder.append(tbArray.get(id).getBrightness());
                tableBuilder.append("|");
                tableBuilder.append(tbArray.get(id).getModel());
                tableBuilder.append("|");
                tableBuilder.append(tbArray.get(id).getState());
                tableBuilder.append("\n");
                column.add(tableBuilder.toString());
                System.out.println(column.toString());

            }
        }
        else if(replace) {
            tbArray.get(id).setState(sc.switchBulb());
            tableBuilder.append(tbArray.get(id).getId());
            tableBuilder.append("|");
            tableBuilder.append(tbArray.get(id).getColor());
            tableBuilder.append("|");
            tableBuilder.append(tbArray.get(id).getType());
            tableBuilder.append("|");
            tableBuilder.append(tbArray.get(id).getBrightness());
            tableBuilder.append("|");
            tableBuilder.append(tbArray.get(id).getModel());
            tableBuilder.append("|");
            tableBuilder.append(tbArray.get(id).getState());
            tableBuilder.append("\n");
            column.remove(id);
            column.add(tableBuilder.toString());
            System.out.println(column.toString());
        }


    }


    public void displayTable()
    {


        if(tbArray.size() == 0)
        {
            System.out.println("No Devices Available");
        }
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
              displayTable(id,false);
    }

    public void editTable(String deviceModel,String deviceType,String deviceColor,String deviceBrightness,int id)
    {

           tbArray.set(id,new devices(Integer.toString(tbArray.size()),deviceModel,deviceType,deviceBrightness,deviceColor,sc.defaultBulb()));
           displayTable(id,true);
    }

    public void editTable(int id)
    {

        displayTable(id,true);
    }

    public void clearTable()
    {
        tbArray.clear();
    }




}
