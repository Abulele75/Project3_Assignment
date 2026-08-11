package za.ac.cput.project3assignment.domain;

import jakarta.persistence.*;
import java.util.Date;

/*
Imaan Achmat
230458971
*/

@Entity
@Table(name = "reviews")
public class Review {

    @Id
    private int reviewID;

    private int rating;
    private String comment;
    private Date reviewDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "listing_id")
    private Listing listing;

    protected Review() {
    }

    protected Review(Builder builder) {
        this.reviewID = builder.reviewID;
        this.rating = builder.rating;
        this.comment = builder.comment;
        this.reviewDate = builder.reviewDate;
        this.user = builder.user;
        this.listing = builder.listing;
    }

    public int getReviewID() {
        return reviewID;
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }

    public Date getReviewDate() {
        return reviewDate;
    }

    public User getUser() {
        return user;
    }

    public Listing getListing() {
        return listing;
    }

    @Override
    public String toString() {
        return "Review{" +
                "reviewID=" + reviewID +
                ", rating=" + rating +
                ", comment='" + comment + '\'' +
                ", reviewDate=" + reviewDate +
                ", user=" + user +
                ", listing=" + listing +
                '}';
    }

    public static class Builder {

        private int reviewID;
        private int rating;
        private String comment;
        private Date reviewDate;
        private User user;
        private Listing listing;

        public Builder setReviewID(int reviewID) {
            this.reviewID = reviewID;
            return this;
        }

        public Builder setRating(int rating) {
            this.rating = rating;
            return this;
        }

        public Builder setComment(String comment) {
            this.comment = comment;
            return this;
        }

        public Builder setReviewDate(Date reviewDate) {
            this.reviewDate = reviewDate;
            return this;
        }

        public Builder setUser(User user) {
            this.user = user;
            return this;
        }

        public Builder setListing(Listing listing) {
            this.listing = listing;
            return this;
        }

        public Review build() {
            return new Review(this);
        }
    }
}