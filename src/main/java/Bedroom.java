import org.junit.Before;

public class Bedroom extends Room {
    private BedroomTypes type;
    private int roomNum;
    private int nightlyRate;

    public Bedroom(BedroomTypes type, int roomNum, int nightlyRate) {
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
}
