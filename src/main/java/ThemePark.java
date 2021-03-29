import attractions.Attraction;
import behaviours.IReviewed;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IReviewed> reviewed;

    public ThemePark() {
        this.reviewed = new ArrayList<>();
    }

    public ArrayList<IReviewed> getAllReviewed() {
        return reviewed;
    }

    public void addItemToReviewed(IReviewed item) {
        if (item.getRating() > 0) {
            reviewed.add(item);
        }
    }

    public int getReviewedItemsSize() {
        return reviewed.size();
    }
}
