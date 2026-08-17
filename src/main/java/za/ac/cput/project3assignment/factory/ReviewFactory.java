/*
Imaan Achmat
230458971
*/

package za.ac.cput.project3assignment.factory;
import za.ac.cput.project3assignment.domain.Listing;
import za.ac.cput.project3assignment.domain.Review;
import za.ac.cput.project3assignment.domain.User;
import java.util.Date;

public class ReviewFactory {
    public static Review createReview(int reviewID, int rating, String comment, Date reviewDate, User user, Listing listing) {

        return new Review.Builder()
                .setReviewID(reviewID)
                .setRating(rating)
                .setComment(comment)
                .setReviewDate(reviewDate)
                .setUser(user)
                .setListing(listing)
                .build();

    }
}
