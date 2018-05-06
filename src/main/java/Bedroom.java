import java.util.ArrayList;

public class Bedroom extends Room {
    private BedroomTypes type;
    private int roomNum;
    private double nightlyRate;
    private ArrayList<Guest> guests;



    public Bedroom(int capacity, BedroomTypes type, int roomNum, double nightlyRate) {
        super(capacity);
        this.type = type;
        this.roomNum = roomNum;
        this.nightlyRate = nightlyRate;
    }

    public BedroomTypes getType() {
        return type;
    }

    public void setType(BedroomTypes type) {
        this.type = type;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public double getNightlyRate() {
        return nightlyRate;
    }

    public void setNightlyRate(double nightlyRate) {
        this.nightlyRate = nightlyRate;
    }

    public int getCapacity() {
        return capacity;
    }


}


