package za.ac.cput.project3assignment.domain;

import jakarta.persistence.*;
import za.ac.cput.project3assignment.domain.User;

@Entity
@Table(name = "cart")

public class Cart {
    @Id
    private String cartId;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    protected Cart() {
    }

    public String getCartId() {
        return cartId;}

    public User getUser() {
        return user;}

    protected Cart(Builder builder) {
        this.cartId = builder.cartId;
        this.user = builder.user;
    }

    public String toString() {
        return "Cart{" +
                "cartId='" + cartId + '\'' +
                ", user=" + user +
                '}';
    }

    public static class Builder {
        private String cartId;
        private User user;

        public Builder setCartId(String cartId) {
            this.cartId = cartId;
            return this;
        }

        public Builder setUser(User user) {
            this.user = user;
            return this;
        }

        public Cart build(){
            return new Cart(this) {
            };
        }
    }
}
