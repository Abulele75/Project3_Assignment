package za.ac.cput.project3assignment.controller;

/* Stephanie Tola Oluwafemi Lewu
230211216
Payment Factory Class
16/08/2026
 */

import org.springframework.web.bind.annotation.*;
import za.ac.cput.project3assignment.domain.Payment;
import za.ac.cput.project3assignment.service.PaymentService;

import java.util.List;

@RestController
@RequestMapping("/api/payment")
@CrossOrigin(origins = "http://localhost:5173")

public class PaymentController {

    private final PaymentService paymentService;
    public PaymentController(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    @PostMapping
    public Payment create(@RequestBody Payment payment) {
        return paymentService.create(payment);
    }

    @GetMapping("/paymentID")
    public Payment read(@PathVariable String paymentID) {
        return paymentService.read(paymentID);
    }

    @GetMapping
    public List<Payment> getAll() {
        return paymentService.getAll();
    }

    @PutMapping
    public Payment update(@RequestBody Payment payment) {
        return paymentService.update(payment);
    }

    @DeleteMapping("/paymentID")
    public void delete(@PathVariable String paymentId) {
        paymentService.delete(paymentId);
    }
}