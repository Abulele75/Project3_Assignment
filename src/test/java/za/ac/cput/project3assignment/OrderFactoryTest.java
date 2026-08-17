package za.ac.cput.project3assignment;

import org.junit.jupiter.api.Test;
import za.ac.cput.project3assignment.domain.Order;
import za.ac.cput.project3assignment.domain.User;
import za.ac.cput.project3assignment.factory.OrderFactory;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OrderFactoryTest {

    User user = new User.Builder()
            .setUserId("U001")
            .setFirstName("John")
            .setLastName("Doe")
            .setEmail("john.doe@example.com")
            .setPassword("password123")
            .setRole("Customer")
            .build();


    @Test
    void createOrder() {
        Order order = OrderFactory.createOrder("O001", new Date(2026,07,17)
                , 500, "Received", user);

        assertNotNull(order);
        assertEquals("O001", order.getOrderId());
        assertEquals(new Date(2026,07,17), order.getOrderDate());
        assertEquals(500, order.getTotalAmount());
        assertEquals("Received", order.getStatus());
        assertEquals(user, order.getUser());

    }

    @Test
    void createOrderWithNullUser() {
        Order order = OrderFactory.createOrder("O002", new Date(2026,07,17)
                , 300, "Pending", null);

        assertNotNull(order);
        assertEquals("O002", order.getOrderId());
        assertEquals(new Date(2026,07,17), order.getOrderDate());
        assertEquals(300, order.getTotalAmount());
        assertEquals("Pending", order.getStatus());
        assertEquals(null, order.getUser());
    }
    @Test
    void createOrderWithNegativeTotalAmount() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () ->
                OrderFactory.createOrder("O003", new Date(2026,07,17), -100, "Cancelled", user)
        );
        assertEquals("Total amount must be greater than zero.", exception.getMessage());
    }

}