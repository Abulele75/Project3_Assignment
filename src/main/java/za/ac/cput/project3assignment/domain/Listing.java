package za.ac.cput.project3assignment.domain;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "listing")
public class Listing {

    @Id
    private String listingID;

    private String title;
    private String description;
    private double price;
    private String type;
    private String imageURL;
    private Date datePosted;
    private String status;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    protected Listing() {
    }

    protected Listing(Builder builder) {
        this.listingID = builder.listingID;
        this.title = builder.title;
        this.description = builder.description;
        this.price = builder.price;
        this.type = builder.type;
        this.imageURL = builder.imageURL;
        this.datePosted = builder.datePosted;
        this.status = builder.status;
        this.user = builder.user;
        this.category = builder.category;
    }

    public String getListingID() {
        return listingID;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public String getImageURL() {
        return imageURL;
    }

    public Date getDatePosted() {
        return datePosted;
    }

    public String getStatus() {
        return status;
    }

    public User getUser() {
        return user;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Listing{" +
                "listingID='" + listingID + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", imageURL='" + imageURL + '\'' +
                ", datePosted=" + datePosted +
                ", status='" + status + '\'' +
                ", user=" + user +
                ", category=" + category +
                '}';
    }

    public static class Builder {

        private String listingID;
        private String title;
        private String description;
        private double price;
        private String type;
        private String imageURL;
        private Date datePosted;
        private String status;
        private User user;
        private Category category;

        public Builder setListingID(String listingID) {
            this.listingID = listingID;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }

        public Builder setDatePosted(Date datePosted) {
            this.datePosted = datePosted;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Builder setUser(User user) {
            this.user = user;
            return this;
        }

        public Builder setCategory(Category category) {
            this.category = category;
            return this;
        }

        public Listing build() {
            return new Listing(this);
        }
    }
}