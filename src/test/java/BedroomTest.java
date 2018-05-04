import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom;

    @Before
    public void before() {
        bedroom = new Bedroom(BedroomTypes.DOUBLE, 2, 77);
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
       assertEquals(77, bedroom.getNightlyRate());
    }

    @Test
    public void canchangeNightlyRate(){
       bedroom.setNightlyRate(99);
       assertEquals(99, bedroom.getNightlyRate());
    }
}
