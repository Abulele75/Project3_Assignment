package za.ac.cput.project3assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.project3assignment.domain.Order;
/* Abulele Ntwanambi
218276400
Order repository class
12/08/2026
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, String> {
}
