import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom;
    Guest guest;
    ArrayList<Guest> guests;

    @Before
    public void before() {
        bedroom = new Bedroom(2, BedroomTypes.DOUBLE, 2, 77);
        guests = new ArrayList<>();
    }

    @Test
    public void cangetType(){
        assertEquals(BedroomTypes.DOUBLE, bedroom.getType());
    }

    @Test
    public void canchangeType(){
        bedroom.setType(BedroomTypes.SINGLE);
        assertEquals(BedroomTypes.SINGLE, bedroom.getType());

    }
    @Test
    public void cangetRoomNum(){
        assertEquals(2, bedroom.getRoomNum());
    }

    @Test
    public void canChangeRoomNum (){
        bedroom.setRoomNum(3);
        assertEquals(3, bedroom.getRoomNum());
    }
    @Test
    public void cangetNightlyRate(){
       assertEquals(77, bedroom.getNightlyRate(), 0.01);
    }

    @Test
    public void canchangeNightlyRate(){
       bedroom.setNightlyRate(99);
       assertEquals(99, bedroom.getNightlyRate(), 0.01);
    }
    @Test
    public void cangetRoomCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }
    @Test
    public void bedroomStartsEmpty(){
        assertEquals(0, bedroom.getGuests().size());
    }
    @Test
    public void canAddGuesttoBedroom(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getGuests().size());
    }
    @Test
    public void canRemoveGuestfromBedroom(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getGuests().size());
        bedroom.removeGuest(guest);
        assertEquals(0, bedroom.getGuests().size());
    }


//    @Test
//    public void canGetGuests(){
//        bedroom.addGuest(guest);
//        assertEquals(guests, bedroom.getGuests());
//
//    }



}
