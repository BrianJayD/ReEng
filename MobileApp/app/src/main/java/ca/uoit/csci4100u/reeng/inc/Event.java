package ca.uoit.csci4100u.reeng.inc;

/**
 * Created by Bashini on 2018-07-28.
 */

public class Event {
    private String eventName;
    private String eventLocation;

    public Event(String eventName,String eventLocation){
        this.eventName=eventName;
        this.eventLocation=eventLocation;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
}
