package za.ac.cput.project3assignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import za.ac.cput.project3assignment.controller.OrderController;
import za.ac.cput.project3assignment.domain.Order;
import za.ac.cput.project3assignment.domain.User;
import za.ac.cput.project3assignment.service.OrderService;


import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class OrderControllerTest {

    @Mock
    private OrderService orderService;

    @InjectMocks
    private OrderController orderController;
    private Order order;

    @BeforeEach
    void setUp() {
        order = new Order.Builder()
                .setOrderId("O001")
                .setTotalAmount(500)
                .setOrderDate(new java.util.Date(2026, 07, 17))
                .setStatus("Received")
                .setUser(new User.Builder()
                        .setUserId("U001")
                        .setFirstName("John Doe")
                        .setLastName("Doe")
                        .setEmail("john.doe@example.com")
                        .build())
                .build();
    }

    @Test
    void testCreateOrder() {
        when(orderService.create(order)).thenReturn(order);
        Order createdOrder = orderController.createOrder(order);

        assertNotNull(createdOrder);
        assertNotNull(createdOrder.getOrderId());
    }

    @Test
    void testRead(){
        when(orderService.read("O001")).thenReturn(order);
        Order readOrder = orderController.read("O001");

        assertNotNull(readOrder);
        assertNotNull(readOrder.getOrderId());
    }
    @Test
    void getAllOrders() {
        when(orderService.getAll()).thenReturn(java.util.Collections.singletonList(order));
        java.util.List<Order> orders = orderController.getAllOrders();

        assertNotNull(orders);
        assertNotNull(orders.get(0).getOrderId());
    }
}
