package za.ac.cput.project3assignment.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import za.ac.cput.project3assignment.domain.User;

import java.util.Date;

@Entity
@Table(name = "orders")
public  class Order {

    @Id
    private String orderId;
    private Date orderDate;
    private double totalAmount;
    private String status;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    protected Order() {
    }

    public String getOrderId() {
        return orderId;}

    public Date getOrderDate() {
        return orderDate;}

    public double getTotalAmount() {
        return totalAmount;}

    public String getStatus() {
        return status;}

    public User getUser() {
        return user;}

    protected Order(Builder builder) {
        this.orderId = builder.orderId;
        this.orderDate = builder.orderDate;
        this.totalAmount = builder.totalAmount;
        this.status = builder.status;
        this.user = builder.user;
    }
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", orderDate=" + orderDate +
                ", totalAmount=" + totalAmount +
                ", status='" + status + '\'' +
                ", user=" + user +
                '}';
    }
    public static class Builder {
        private String orderId;
        private Date orderDate;
        private double totalAmount;
        private String status;
        private User user;

        public Builder setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public Builder setOrderDate(Date orderDate) {
            this.orderDate = orderDate;
            return this;
        }

        public Builder setTotalAmount(double totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Builder setUser(User user) {
            this.user = user;
            return this;
        }

        public Order build() {
            return new Order(this) {};
        }
    }
}
