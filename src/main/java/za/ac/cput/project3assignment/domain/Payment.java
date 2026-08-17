package za.ac.cput.project3assignment.domain;

import    jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "payment")
public class Payment {

    @Id
    private String paymentID;

    private double amount;
    private String paymentMethod;
    private String paymentStatus;
    private Date paymentDate;

    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;

    protected Payment() {
    }

    protected Payment(Builder builder) {
        this.paymentID = builder.paymentID;
        this.amount = builder.amount;
        this.paymentMethod = builder.paymentMethod;
        this.paymentStatus = builder.paymentStatus;
        this.paymentDate = builder.paymentDate;
        this.order = builder.order;
    }

    public String getPaymentID() {
        return paymentID;
    }

    public double getAmount() {
        return amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public Order getOrder() {
        return order;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentID='" + paymentID + '\'' +
                ", amount=" + amount +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", paymentStatus='" + paymentStatus + '\'' +
                ", paymentDate=" + paymentDate +
                ", order=" + order +
                '}';
    }

    public static class Builder {

        private String paymentID;
        private double amount;
        private String paymentMethod;
        private String paymentStatus;
        private Date paymentDate;
        private Order order;

        public Builder setPaymentID(String paymentID) {
            this.paymentID = paymentID;
            return this;
        }

        public Builder setAmount(double amount) {
            this.amount = amount;
            return this;
        }

        public Builder setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public Builder setPaymentStatus(String paymentStatus) {
            this.paymentStatus = paymentStatus;
            return this;
        }

        public Builder setPaymentDate(Date paymentDate) {
            this.paymentDate = paymentDate;
            return this;
        }

        public Builder setOrder(Order order) {
            this.order = order;
            return this;
        }

        public Payment build() {
            return new Payment(this);
        }
    }
}