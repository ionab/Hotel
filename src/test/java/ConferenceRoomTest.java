import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    Conference conferenceRoom;

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
}
