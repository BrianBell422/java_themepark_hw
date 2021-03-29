import attractions.RollerCoaster;
import behaviours.IReviewed;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    IReviewed rollerCoaster;

    @Before
    public void before() {
        themePark = new ThemePark();
        rollerCoaster = new RollerCoaster("Pepsi Max", 3);
    }

    @Test
    public void allReviewed() {
        themePark.addItemToReviewed(rollerCoaster);
        assertEquals(1, themePark.getReviewedItemsSize());
    }
}
