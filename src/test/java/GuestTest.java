import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void before() {
        guest = new Guest("Alice");
    }

    @Test
    private void canGetName(){
        assertEquals("Alice", guest.getName());

    }

    @Test
    private void canChangeName(){
        guest.setName("Katie");
        assertEquals("Katie", guest.getName());
    }

}
