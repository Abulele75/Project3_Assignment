package za.ac.cput.project3assignment.service;

import za.ac.cput.project3assignment.domain.Listing;

import java.util.List;

/* Keano Elchano Winnaar
230935869
Listing factory class
21/08/2026
 */

public interface IListingService {
    Listing create(Listing listing);
    Listing read(String listingID);
    List<Listing> getAll();
    Listing update(Listing listing);
    void delete(String listingID);
}
