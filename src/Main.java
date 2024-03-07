import java.util.Date;
import java.util.Scanner;
public class Main {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter event ID:");
        String eventID = scanner.nextLine();

        System.out.println("Enter event name:");
        String eventName = scanner.nextLine();

        System.out.println("Enter event venue:");
        String eventVenue = scanner.nextLine();

        System.out.println("Enter event date (MM/dd/yyyy):");
        String dateString = scanner.nextLine();
        
        Date eventDate = new Date(dateString); 

        Event event = new Event(eventID, eventName, eventVenue, eventDate);

        System.out.println("Enter the number of attendees:");
        int numAttendees = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < numAttendees; i++) {
            System.out.println("Enter attendee name:");
            String attendee = scanner.nextLine();
            event.addAttendee(attendee);
        }

        System.out.println("Total attendees: " + event.getTotalAttendees());

        System.out.println("Enter the attendee name to remove:");
        String attendeeToRemove = scanner.nextLine();
        event.removeAttendee(attendeeToRemove);

        System.out.println("Enter the old attendee name to update:");
        String oldAttendee = scanner.nextLine();
        System.out.println("Enter the new attendee name:");
        String newAttendee = scanner.nextLine();
        event.updateAttendee(oldAttendee, newAttendee);

        System.out.println("Enter the attendee name to find:");
        String attendeeToFind = scanner.nextLine();
        System.out.println(event.findAttendee(attendeeToFind));

        System.out.println(event);

        scanner.close();
    }
}
