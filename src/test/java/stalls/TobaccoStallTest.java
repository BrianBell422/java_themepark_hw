package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor, visitor2;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 4);
        visitor = new Visitor(12, 120, 10);
        visitor2 = new Visitor(18, 180, 40);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void youngVisitorCannotEnterTobaccoStall() {
        assertFalse(tobaccoStall.isAllowedTo(visitor));
    }

    @Test
    public void oldVisitorCanEnterTobaccoStall() {
        assertTrue(tobaccoStall.isAllowedTo(visitor2));
    }
}
