import java.util.ArrayList;
import java.util.Date;

class Event {
    private String eventID;
    private String eventName;
    private String eventVenue;
    private Date eventDate;
    private ArrayList<String> eventAttendees;

    public Event(String eventID, String eventName, String eventVenue, Date eventDate) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventVenue = eventVenue;
        this.eventDate = eventDate;
        this.eventAttendees = new ArrayList<>();
    }

    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventVenue() {
        return eventVenue;
    }

    public void setEventVenue(String eventVenue) {
        this.eventVenue = eventVenue;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public ArrayList<String> getEventAttendees() {
        return eventAttendees;
    }

    public void setEventAttendees(ArrayList<String> eventAttendees) {
        this.eventAttendees = eventAttendees;
    }

    public void addAttendee(String attendee) {
        eventAttendees.add(attendee);
    }

    public void removeAttendee(String attendee) {
        eventAttendees.remove(attendee);
    }

    public void updateAttendee(String oldAttendee, String newAttendee) {
        int index = eventAttendees.indexOf(oldAttendee);
        if (index != -1) {
            eventAttendees.set(index, newAttendee);
        }
    }

    public String findAttendee(String attendeeName) {
        if (eventAttendees.contains(attendeeName)) {
            return "Attendee found: " + attendeeName;
        } else {
            return "Attendee not found";
        }
    }

    public int getTotalAttendees() {
        return eventAttendees.size();
    }

    
    public String toString() {
        return "Event{" +
                "eventID='" + eventID + '\'' +
                ", eventName='" + eventName + '\'' +
                ", eventVenue='" + eventVenue + '\'' +
                ", eventDate=" + eventDate +
                ", eventAttendees=" + eventAttendees +
                '}';
    }
}
