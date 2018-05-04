import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    ArrayList<Bedroom> bedrooms;
    ArrayList<Conference> conferencerooms;


    @Before
    public void before(){
        bedrooms = new ArrayList<Bedroom>();
        bedrooms.add(new Bedroom(2, BedroomTypes.DOUBLE, 8, 100.00));
        bedrooms.add(new Bedroom(2, BedroomTypes.DOUBLE, 8, 100.00));
        conferencerooms = new ArrayList<Conference>();
        conferencerooms.add(new Conference(20, 200.00));
        conferencerooms.add(new Conference(20, 200.00));
        hotel = new Hotel(bedrooms, conferencerooms);

    }

    @Test
    public void bedroomsArrayHasSize() {
        assertEquals(2, hotel.getBedrooms().size());
    }
    @Test
    public void conferenceroomsArrayHasSize() {
        assertEquals(2, hotel.getConferencerooms().size());
    }

}
