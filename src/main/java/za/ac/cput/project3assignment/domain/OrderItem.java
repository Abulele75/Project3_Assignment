package za.ac.cput.project3assignment.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "order_item")
public class OrderItem {

    @Id
    private String orderItemID;

    private int quantity;
    private double price;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "listing_id")
    private Listing listing;

    protected OrderItem() {
    }

    protected OrderItem(Builder builder) {
        this.orderItemID = builder.orderItemID;
        this.quantity = builder.quantity;
        this.price = builder.price;
        this.order = builder.order;
        this.listing = builder.listing;
    }

    public String getOrderItemID() {
        return orderItemID;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public Order getOrder() {
        return order;
    }

    public Listing getListing() {
        return listing;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "orderItemID='" + orderItemID + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", order=" + order +
                ", listing=" + listing +
                '}';
    }

    public static class Builder {

        private String orderItemID;
        private int quantity;
        private double price;
        private Order order;
        private Listing listing;

        public Builder setOrderItemID(String orderItemID) {
            this.orderItemID = orderItemID;
            return this;
        }

        public Builder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setOrder(Order order) {
            this.order = order;
            return this;
        }

        public Builder setListing(Listing listing) {
            this.listing = listing;
            return this;
        }

        public OrderItem build() {
            return new OrderItem(this);
        }
    }
}