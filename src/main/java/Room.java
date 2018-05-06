import java.util.ArrayList;
import java.util.logging.SimpleFormatter;

public abstract class Room {


    public int capacity;
    public ArrayList<Guest> guests;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guests =new ArrayList<>();
    }

//    returns room capacity - getter

    public int getCapacity() {
        return capacity;
    }

//  allows reset of rooms capacity

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

//    returns an array list of object guests

    public ArrayList<Guest> getGuests() {
        return guests;
    }

//    allows a guest to be added to the room
    public void addGuest(Guest guests){
        this.guests.add(guests);
    }

//    allows a guest to be removed from the room
    public void removeGuest(Guest guest){
        this.guests.remove(guest);
    }



}
