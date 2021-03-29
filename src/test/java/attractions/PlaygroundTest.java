package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class PlaygroundTest {
    Playground playground;
    Visitor visitor, visitor2;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        visitor = new Visitor(12, 120, 10);
        visitor2 = new Visitor(18, 180, 40);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void youngVisitorCanEnterPlayground() {
        assertTrue(playground.isAllowedTo(visitor));
    }

    @Test
    public void oldVisitorCannotEnterPlayground() {
        assertFalse(playground.isAllowedTo(visitor2));
    }
}

