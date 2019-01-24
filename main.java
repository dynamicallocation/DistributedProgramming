
package main.java;
import java.util.Scanner;

public class main
{
    private static Table tb = new Table();
    private static Scanner ans = new Scanner(System.in);

    public static void main(String args[])
    {



        while(true)
        {
            Scanner ans = new Scanner(System.in);
            tb.displayTable();
            System.out.println("What would you like to do?");
            int answer = ans.nextInt();


            switch (answer) {
                case 1:  add();
                    break;
                case 2:  remove();
                    break;
                case 3:  edit();
                    break;
                case 4:  delete();
                    break;
                case 5:  exit();
                    break;
                default: System.out.println("Invalid Input");
                    break;
            }

            continue;








        }


    }

    public static void add()
    {
        System.out.println("enter a model: ");
        String model = ans.nextLine();
        System.out.println("enter type of device: ");
        String type = ans.nextLine();
        System.out.println("enter brightness: ");
        String brightness = ans.nextLine();
        System.out.println("enter state of device: ");
        String state = ans.nextLine();
        System.out.println("enter color of device: ");
        String color = ans.nextLine();
        tb.addToTable(model,type,state,color);


    }

    public static void remove()
    {
        tb.displayTable();
        System.out.println("enter ID of device you would like to remove");
        int id = ans.nextInt();
        tb.removeFromTable(id);

    }

    public static void edit()
    {

    }

    public static void delete()
    {

    }

    public static void exit()
    {
        System.exit(1);
    }
}