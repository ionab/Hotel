import java.util.ArrayList;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<Conference> conferencerooms;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<Conference> conferencerooms) {
        this.bedrooms = bedrooms;
        this.conferencerooms = conferencerooms;
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(ArrayList<Bedroom> bedrooms) {
        this.bedrooms = bedrooms;
    }

    public ArrayList<Conference> getConferencerooms() {
        return conferencerooms;
    }

    public void setConferencerooms(ArrayList<Conference> conferencerooms) {
        this.conferencerooms = conferencerooms;
    }
}

