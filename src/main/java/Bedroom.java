import org.junit.Before;

public class Bedroom extends Room {
    private BedroomTypes type;
    private int roomNum;
    private int nightlyRate;

    public Bedroom(int capacity, BedroomTypes type, int roomNum, int nightlyRate) {
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

    public int getNightlyRate() {
        return nightlyRate;
    }

    public void setNightlyRate(int nightlyRate) {
        this.nightlyRate = nightlyRate;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}


