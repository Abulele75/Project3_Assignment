package za.ac.cput.project3assignment.factory;

import za.ac.cput.project3assignment.domain.Order;
import za.ac.cput.project3assignment.domain.User;

import java.util.Date;

/*
 * Abulele Ntwanambi
 * 218276400
 * Order Factory Class
 * 12/08/2026
 */

public class OrderFactory {

    public static Order createOrder(
            String orderId,
            Date orderDate,
            double totalAmount,
            String status,
            User user) {

        return new Order.Builder()
                .setOrderId(orderId)
                .setOrderDate(orderDate)
                .setTotalAmount(totalAmount)
                .setStatus(status)
                .setUser(user)
                .build();
    }
}
