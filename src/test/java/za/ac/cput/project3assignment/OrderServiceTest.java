package za.ac.cput.project3assignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import za.ac.cput.project3assignment.domain.Order;
import za.ac.cput.project3assignment.domain.User;
import za.ac.cput.project3assignment.repository.OrderRepository;
import za.ac.cput.project3assignment.service.OrderService;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)

public class OrderServiceTest {

    @Mock
    private OrderRepository orderRepository;

    @InjectMocks
    private OrderService orderService;
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
        when(orderRepository.save(order)).thenReturn(order);
        Order create = orderService.create(order);
        assertEquals(order, create);
        assertEquals("O001", create.getOrderId());
        assertEquals(500, create.getTotalAmount());
        assertEquals("Received", create.getStatus());
    }

    @Test
    void getAll(){
        List<Order> orders = new ArrayList<>();

        when(orderRepository.findAll()).thenReturn(orders);
        List<Order> orderList = orderService.getAll();
        assertEquals(orders, orderList);

    }

    @Test
    void testDeleteOrder() {
        doNothing().when(orderRepository).deleteById(order.getOrderId());
        orderService.delete(order.getOrderId());
    }
}
