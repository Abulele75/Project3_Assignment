package za.ac.cput.project3assignment.service;

/* Stephanie Lewu
230211216
Payment Factory Class
16/08/2026
 */


import za.ac.cput.project3assignment.domain.Payment;

import java.util.List;

public interface IPaymentService {

    Payment create(Payment payment);
    Payment read(String paymentId);
    List<Payment> getAll();
    Payment update (Payment payment);
    void delete (String paymentId);
}
