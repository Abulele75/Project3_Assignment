package za.ac.cput.project3assignment.service;

import org.springframework.stereotype.Service;
import za.ac.cput.project3assignment.domain.Order;
import za.ac.cput.project3assignment.repository.OrderRepository;

import java.util.List;
/* Abulele Ntwanambi
218276400
Order service class
12/08/2026
 */

@Service
public class OrderService implements IOrder{

    private final OrderRepository orderRepository;
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order create(Order order) {
        if (order == null) {
            throw new NullPointerException("Order cannot be null");
        }
        return orderRepository.save(order);
    }

    @Override
    public Order read(String orderId) {
        return orderRepository.findById(orderId).orElse(null);
    }

    @Override
    public List<Order> getAll() {
        return orderRepository.findAll();
    }

    @Override
    public Order update(Order order) {
        if (order == null) {
            throw new NullPointerException("Order cannot be null");
        }
        return orderRepository.save(order);
    }


    @Override
    public void delete(String orderId) {
        orderRepository.deleteById(orderId);

    }
}
