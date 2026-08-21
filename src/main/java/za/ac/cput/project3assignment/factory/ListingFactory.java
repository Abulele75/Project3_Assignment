package za.ac.cput.project3assignment.factory;

import za.ac.cput.project3assignment.domain.Category;
import za.ac.cput.project3assignment.domain.Listing;
import za.ac.cput.project3assignment.domain.User;

import java.util.Date;

/* Keano Elchano Winnaar
230935869
Listing factory class
21/08/2026
 */

public class ListingFactory {

    public static Listing createListing(
            String listingID,
            String title,
            String description,
            double price,
            String type,
            String imageURL,
            Date datePosted,
            String status,
            User user,
            Category category) {

        return new Listing.Builder()
                .setListingID(listingID)
                .setTitle(title)
                .setDescription(description)
                .setPrice(price)
                .setType(type)
                .setImageURL(imageURL)
                .setDatePosted(datePosted)
                .setStatus(status)
                .setUser(user)
                .setCategory(category)
                .build();
    }
}