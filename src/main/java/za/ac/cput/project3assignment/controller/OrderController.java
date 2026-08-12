package za.ac.cput.project3assignment.controller;

import org.springframework.web.bind.annotation.*;
import za.ac.cput.project3assignment.domain.Order;
import za.ac.cput.project3assignment.service.OrderService;

import java.util.List;

/* Abulele Ntwanambi
218276400
Order controller class
12/08/2026
 */

@RestController
@RequestMapping("/api/orders")
@CrossOrigin(origins = "http://localhost:5173")
public class OrderController {

    private final OrderService orderService;
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        return orderService.create(order);
    }
    @GetMapping("/{orderId}")
    public Order getOrderById(@PathVariable String orderId) {
        return orderService.read(orderId);
    }
    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAll();
    }

    @PutMapping
    public Order updateOrder(@PathVariable String orderId, @RequestBody Order order) {
        return orderService.update(order);
    }
    @DeleteMapping("/{orderId}")
    public void deleteOrder(@PathVariable String orderId) {
        orderService.delete(orderId);

    }
}
