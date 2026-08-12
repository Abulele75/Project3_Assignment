package za.ac.cput.project3assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.project3assignment.domain.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, String> {
}