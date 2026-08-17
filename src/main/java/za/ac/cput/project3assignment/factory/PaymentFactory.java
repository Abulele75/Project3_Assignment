package za.ac.cput.project3assignment.factory;

/* Stephanie Tola Oluwafemi Lewu
230211216
Payment Factory Class
12/08/2026
 */

import za.ac.cput.project3assignment.domain.Payment;

import java.util.Date;

public class PaymentFactory {
    public static Payment createPayment(String paymentID, double amount, String paymentMethod, String paymentStatus, Date paymentDate){
        return  new Payment.Builder()
                .setPaymentID(paymentID)
                .setAmount(amount)
                .setPaymentMethod(paymentMethod)
                .setPaymentStatus(paymentStatus)
                .setPaymentDate(paymentDate)
                .build();

    }


}
