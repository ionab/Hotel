import java.util.ArrayList;
import java.util.logging.SimpleFormatter;

public abstract class Room {


    public int capacity;
    public ArrayList<Guest> guests;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guests =new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void addGuest(Guest guests){
        this.guests.add(guests);
    }

    public void removeGuest(Guest guest){
        this.guests.remove(guest);
    }



}
