import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    Conference conferenceRoom;
    Guest guest;

    @Before
    public void before(){
        conferenceRoom =  new Conference(30, 100.00);
    }

    @Test
    public void cangetCapacity(){
        assertEquals(30, conferenceRoom.getCapacity());
    }

    @Test
    public void cansetCapacity(){
        conferenceRoom.setCapacity(90);
        assertEquals(90, conferenceRoom.getCapacity());
    }

    @Test
    public void cangetDailyRate(){
        assertEquals(100, conferenceRoom.getDailyRate(), 0.01);
    }

    @Test
    public void cansetDailyRate(){
        conferenceRoom.setDailyRate(120.00);
        assertEquals(120.00, conferenceRoom.getDailyRate(), 0.01);
    }

    @Test
    public void conferenceRoomStartsEmpty(){
        assertEquals(0, conferenceRoom.getGuests().size());
    }
    @Test
    public void canAddGuesttoConferenceRoom(){
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.getGuests().size());
    }
    @Test
    public void canRemoveGuestfromConferenceRoom(){
        conferenceRoom.addGuest(guest);
        assertEquals(1, conferenceRoom.getGuests().size());
        conferenceRoom.removeGuest(guest);
        assertEquals(0, conferenceRoom.getGuests().size());
    }
}
