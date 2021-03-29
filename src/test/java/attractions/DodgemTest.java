package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitor, visitor2;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitor = new Visitor(18, 180, 10);
        visitor2 = new Visitor(10, 120, 40);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void normalCharge() {
        assertEquals(4.50, dodgems.priceFor(visitor), 0.0);
    }

    @Test
    public void under12Charge() {
        assertEquals(2.25, dodgems.priceFor(visitor2), 0.0);
    }
}
