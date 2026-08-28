package za.ac.cput.project3assignment.service;

import org.springframework.stereotype.Service;
import za.ac.cput.project3assignment.domain.Listing;
import za.ac.cput.project3assignment.repository.ListingRepository;

import java.util.List;

/* Keano Elchano Winnaar
230935869
Listing factory class
21/08/2026
 */

@Service
public class ListingService implements IListingService {

    private final ListingRepository listingRepository;

    public ListingService(ListingRepository listingRepository) {
        this.listingRepository = listingRepository;
    }

    @Override
    public Listing create(Listing listing) {
        if (listing == null) {
            throw new NullPointerException("Listing cannot be null");
        }

        return listingRepository.save(listing);
    }

    @Override
    public Listing read(String listingID) {
        return listingRepository.findById(listingID).orElse(null);
    }

    @Override
    public List<Listing> getAll() {
        return listingRepository.findAll();
    }

    @Override
    public Listing update(Listing listing) {
        if (listing == null) {
            throw new NullPointerException("Listing cannot be null");
        }

        return listingRepository.save(listing);
    }

    @Override
    public void delete(String listingID) {
        listingRepository.deleteById(listingID);
    }
}