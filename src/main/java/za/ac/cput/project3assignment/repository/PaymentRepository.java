package za.ac.cput.project3assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.project3assignment.domain.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, String> {
}