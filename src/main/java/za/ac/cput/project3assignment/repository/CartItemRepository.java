package za.ac.cput.project3assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.project3assignment.domain.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, String> {
}