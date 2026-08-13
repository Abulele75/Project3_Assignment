package za.ac.cput.project3assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.project3assignment.domain.Cart;
/* Abulele Ntwanambi
218276400
Cart repository class
12/08/2026
 */

@Repository
public interface CartRepository extends JpaRepository<Cart, String> {

}
