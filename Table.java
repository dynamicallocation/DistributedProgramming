package main.java;

import java.util.ArrayList;

public class Table {


    private ArrayList tbArray = new ArrayList();



    public void displayTable()
    {

       displayHeader();
       if(tbArray.size() == 0)
       {
           System.out.println("No Devices Available");
       }
       else
       {
           updateTable();
       }



    }

    private void displayHeader() {

        System.out.println("\nID|Model|State|Brightness|Other");
        System.out.println("----------------------------");

    }

    public int getSize()
    {
        return tbArray.size();
    }

    public void updateTable()
    {
        System.out.println(tbArray.add("Hello World"));
    }

    public void removeFromTable(int id)
    {
        tbArray.remove(id);
    }

    public void addToTable(String deviceModel,String deviceType,String deviceState,String deviceColor)
    {
              tbArray.add(Integer.toString(tbArray.size()) + "|" + deviceModel + "|" + deviceType + "|" + deviceState + "|" + deviceColor + "|");
              displayTable();
    }

    public void editTable(int id,String deviceModel,String deviceType,String deviceState,String deviceColor)
    {
        tbArray.set(id,Integer.toString(id) + "|" + deviceModel + "|" + deviceType + "|" + deviceState + "|" + deviceColor + "|");
    }

}
