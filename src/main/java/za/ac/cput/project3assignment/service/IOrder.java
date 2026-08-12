package za.ac.cput.project3assignment.service;

import za.ac.cput.project3assignment.domain.Order;

import java.util.List;
/* Abulele Ntwanambi
218276400
Order interface class
12/08/2026
 */

public interface IOrder {
    Order create(Order order);
    Order read(String orderId);
    List<Order> getAll();
    Order update(Order order);
    void delete(String orderId);

}
