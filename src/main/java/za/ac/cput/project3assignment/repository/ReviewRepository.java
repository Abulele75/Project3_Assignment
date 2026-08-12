/*
Imaan Achmat
230458971
*/
package za.ac.cput.project3assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.project3assignment.domain.Review;
import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer> {
   List<Review> findByListing_ListingID(int listingID);
}