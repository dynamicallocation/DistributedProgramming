
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class main {
    private static Table tb = new Table();
    private static Scanner ans = new Scanner(System.in);
    private static int size = 0;


    private static class Task extends TimerTask
    {
        private int id;
        public Task(int id)
        {
            this.id = id;
        }

        public void run()
        {

            tb.switchDevice(id);
        }
    }

    public static void main(String args[]) {


        while (true) {

            System.out.println(DateTimeFormatter.ofPattern("hh:mm a").format(LocalTime.now()));

            Scanner ans = new Scanner(System.in);
            System.out.println("What would you like to do?");
            System.out.println("1: add 2: remove 3: edit: 4: delete");
            tb.displayTable();
            int answer = ans.nextInt();


            switch (answer) {
                case 1:
                    add();
                    break;
                 case 2:
                    remove();
                    break;
                case 3:
                    edit();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    exit();
                    break;

                default:
                    System.out.println("Invalid Input");
                    break;
            }

            continue;

        }


    }

    public static void add() {
        System.out.println("enter a model(please enter it twice): ");
        String model = ans.nextLine();
        String m = ans.nextLine();
        String type;
        while (true) {
            System.out.println("enter type of device bulb/outlet/other: ");
            type = ans.nextLine();
            if (type.equalsIgnoreCase("bulb") || type.equalsIgnoreCase("outlet") || type.equalsIgnoreCase("other")) {
                break;
            } else {
                System.out.println("invalid input");
                continue;
            }

        }
        System.out.println("enter brightness: ");
        String brightness = ans.nextLine();
        System.out.println("enter color of device: ");
        String color = ans.nextLine();
        tb.addDevice(model, type, color, brightness, size);
        size++;


    }

    public static void remove()
    {
        tb.displayTable();
        System.out.println("enter ID of device you would like to remove");
        int id = ans.nextInt();
        tb.removeDevice(id);
        size--;

    }

    public static void edit()
    {



            System.out.println("1:change Value 2:Turn Off Device 3:Turn Off Device At Specified Time");
            int answer = ans.nextInt();
            if(answer == 1) {
                tb.displayTable();
                System.out.println("enter ID of device you would like to edit");
                int id = ans.nextInt();
                System.out.println("enter a model: ");
                String model = ans.nextLine();
                System.out.println("\n");
                System.out.println("enter type of device: ");
                String type = ans.nextLine();
                System.out.println("enter brightness: ");
                String brightness = ans.nextLine();
                System.out.println("enter color of device: ");
                String color = ans.nextLine();
                tb.editTable(id,model,type,brightness,color);
            }
            else if(answer == 2) {
                System.out.println("enter ID of device you would like to turn off");
                int id = ans.nextInt();
                tb.switchDevice(id);
            }
            else
            {
                System.out.println("enter ID of device you would like to turn off");
                int id = ans.nextInt();
                System.out.println("enter Second you would like to wait before device is turned off");
                long milli = ans.nextInt();
                int time = (int) milli * 1000;
                Timer timer = new Timer();
                timer.schedule(new Task(id),time);
                System.out.println("Please Wait...");
            }
    }



    public static void delete()
    {
        tb.clear();
    }

    public static void exit()
    {
        System.exit(0);
    }
}