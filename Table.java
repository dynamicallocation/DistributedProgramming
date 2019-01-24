package main.java;

import java.util.ArrayList;

public class Table {


    private ArrayList tbArray = new ArrayList();



    public void displayTable()
    {


        StringBuffer tableBuilder = new StringBuffer();
       displayHeader();
       if(tbArray.size() == 0)
       {
           System.out.println("No Devices Available");
       }
       else
       {

           tableBuilder.append(tbArray.toString());
           tableBuilder.append(System.getProperty("line.separator"));
           System.out.println(tableBuilder.toString());
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

    public void clearTable()
    {
        tbArray.clear();
    }



}
