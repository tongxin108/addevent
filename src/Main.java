// import java.util.Date;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        Scanner reader = new Scanner(System.in);
        Event event = new Event();
        int choice = 0;
        do
        {
            System.out.println("\n"+"Here is what you can do in the program."+"\n");
            System.out.println("Type 1 to enter event details:" + " \n");
            System.out.println("Type 2 to enter attendee names that are coming to the event;" + "\n");
            System.out.println("Type 3 to remove an attendee from the list;" + " \n");
            System.out.println("Type 4 to update ar attendee in the list:"+"\n");
            System.out.println("Type 5 to search for an attendee in the list;"+"\n");
            System.out.println("Type 6 to display all the attendees from the event;"+"\n");
            System.out.println("Type 7 to handle complementary passes;"+"\n");
            System.out.println("Type 8 to handle performances;"+"\n");
            System.out.println("Type 9 to get seat details;"+"\n");
            System.out.println("Type 0 to exit"+"\n");
            choice = reader.nextInt();
            event.organizeEvent(choice);
            
        }while (choice!=0);
        reader.close();
    


    }
    
}

