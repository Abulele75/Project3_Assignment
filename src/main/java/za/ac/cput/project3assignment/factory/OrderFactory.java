package za.ac.cput.project3assignment.factory;

import za.ac.cput.project3assignment.domain.Order;

import java.util.Date;
/* Abulele Ntwanambi
218276400
Order factory class
12/08/2026
 */

public class OrderFactory {
    public static Order createOrder(String orderId, Date orderDate, double totalAmount, String Status) {
        return new Order.Builder()
                .setOrderId(orderId)
                .setOrderDate(orderDate)
                .setStatus(Status)
                .build();
    }
}
