package za.ac.cput.project3assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.project3assignment.domain.Listing;

public interface ListingRepository extends JpaRepository<Listing, String> {
}