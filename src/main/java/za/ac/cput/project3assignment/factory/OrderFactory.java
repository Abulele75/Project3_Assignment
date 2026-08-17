package za.ac.cput.project3assignment.factory;

import za.ac.cput.project3assignment.domain.Order;
import za.ac.cput.project3assignment.domain.User;

import java.util.Date;
/* Abulele Ntwanambi
218276400
Order factory class
12/08/2026
 */

public class OrderFactory {
    public static Order createOrder(String orderId, Date orderDate, double totalAmount, String Status, User user) {

        if(totalAmount <= 0) {
            throw new IllegalArgumentException("Total amount must be greater than zero.");
        }
        if(orderId == null || orderId.isEmpty()) {
            throw new IllegalArgumentException("Order ID cannot be null or empty.");
        }
        if(user == null) {
            throw new IllegalArgumentException("User cannot be null.");
        }
        return new Order.Builder()
                .setOrderId(orderId)
                .setTotalAmount(totalAmount)
                .setOrderDate(orderDate)
                .setStatus(Status)
                .setUser(user)
                .build();
    }
}
