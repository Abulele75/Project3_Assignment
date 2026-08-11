package za.ac.cput.project3assignment.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "cart_item")
public class CartItem {

    @Id
    private String cartItemID;

    private int quantity;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;

    @ManyToOne
    @JoinColumn(name = "listing_id")
    private Listing listing;

    protected CartItem() {
    }

    protected CartItem(Builder builder) {
        this.cartItemID = builder.cartItemID;
        this.quantity = builder.quantity;
        this.cart = builder.cart;
        this.listing = builder.listing;
    }

    public String getCartItemID() {
        return cartItemID;
    }

    public int getQuantity() {
        return quantity;
    }

    public Cart getCart() {
        return cart;
    }

    public Listing getListing() {
        return listing;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "cartItemID='" + cartItemID + '\'' +
                ", quantity=" + quantity +
                ", cart=" + cart +
                ", listing=" + listing +
                '}';
    }

    public static class Builder {

        private String cartItemID;
        private int quantity;
        private Cart cart;
        private Listing listing;

        public Builder setCartItemID(String cartItemID) {
            this.cartItemID = cartItemID;
            return this;
        }

        public Builder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder setCart(Cart cart) {
            this.cart = cart;
            return this;
        }

        public Builder setListing(Listing listing) {
            this.listing = listing;
            return this;
        }

        public CartItem build() {
            return new CartItem(this);
        }
    }
}