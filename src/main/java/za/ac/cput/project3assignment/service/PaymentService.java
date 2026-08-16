package za.ac.cput.project3assignment.service;

/* Stephanie Tola Oluwafemi Lewu
230211216
Payment Factory Class
16/08/2026
 */

import org.springframework.stereotype.Service;
import za.ac.cput.project3assignment.domain.Payment;
import za.ac.cput.project3assignment.repository.PaymentRepository;

import java.util.List;

@Service
public class PaymentService implements IPaymentService {

    private final PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;}

    @Override
    public Payment create(Payment payment) {
        if (payment == null) {
            throw new NullPointerException("Payment cannot be empty");
        }
        return paymentRepository.save(payment);
    }

    @Override
    public Payment read(String paymentId) {
        return paymentRepository.findById(paymentId).orElse(null);
    }

    @Override
    public List<Payment> getAll() {
        return paymentRepository.findAll();}

    @Override
    public Payment update(Payment payment){
        if (payment == null) {
            throw new NullPointerException("Payment cannot be null");
        }
        return  paymentRepository.save(payment);
    }

    @Override
    public void delete(String paymentId){
        paymentRepository.deleteById(paymentId);
    }

}
