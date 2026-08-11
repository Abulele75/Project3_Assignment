package za.ac.cput.project3assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.project3assignment.domain.Cart;

public interface CartRepository extends JpaRepository<Cart, String> {
}