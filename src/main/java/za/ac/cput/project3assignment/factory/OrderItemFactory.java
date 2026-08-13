import za.ac.cput.project3assignment.domain.Listing;
import za.ac.cput.project3assignment.domain.Order;
import za.ac.cput.project3assignment.domain.OrderItem;

/*
 * Abdul Malik Muhammed
 * 230388175
 * Order Item Factory Class
 * 12/08/2026
 */

public class OrderItemFactory {

    public static OrderItem createOrderItem(
            String orderItemID,
            int quantity,
            double price,
            Order order,
            Listing listing) {

        return new OrderItem.Builder()
                .setOrderItemID(orderItemID)
                .setQuantity(quantity)
                .setPrice(price)
                .setOrder(order)
                .setListing(listing)
                .build();
    }
}
