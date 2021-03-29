package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor, visitor2, visitor3, visitor4;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(12, 120, 10);
        visitor2 = new Visitor(18, 180, 40);
        visitor3 = new Visitor(18, 140, 50);
        visitor4 = new Visitor(12, 210, 50);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void visitorNotAllowed() {
        assertFalse(rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void visitorAllowed() {
        assertTrue(rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void visitorNotAllowedTooSmall() {
        assertFalse(rollerCoaster.isAllowedTo(visitor3));
    }

    @Test
    public void visitorNotAllowedTooYoung() {
        assertFalse(rollerCoaster.isAllowedTo(visitor4));
    }

    @Test
    public void tallVisitorCharge() {
        assertEquals(16.80, rollerCoaster.priceFor(visitor4), 0.0);
    }

    @Test
    public void normalVisitorCharge() {
        assertEquals(8.40, rollerCoaster.priceFor(visitor3), 0.0);
    }
}
