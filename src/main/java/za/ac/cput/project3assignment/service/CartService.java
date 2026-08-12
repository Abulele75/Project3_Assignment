package za.ac.cput.project3assignment.service;

import org.springframework.stereotype.Service;
import za.ac.cput.project3assignment.domain.Cart;
import za.ac.cput.project3assignment.domain.Order;
import za.ac.cput.project3assignment.repository.CartRepository;
import za.ac.cput.project3assignment.repository.OrderRepository;

import java.util.List;
/* Abulele Ntwanambi
218276400
Cart service class
12/08/2026
 */

@Service
public class CartService implements ICart {

    private final CartRepository cartRepository;
    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    @Override
    public  Cart create(Cart cart) {
        if (cart == null) {
            throw new NullPointerException("Cart cannot be empty");
        }
        return cartRepository.save(cart);
    }

    @Override
    public Cart read(String cartId) {
        return cartRepository.findById(cartId).orElse(null);
    }

    @Override
    public List<Cart> getAll() {
        return cartRepository.findAll();
    }

    @Override
    public Cart update(Cart cart) {
        if (cart == null) {
            throw new NullPointerException("Cart cannot be null");
        }
        return cartRepository.save(cart);
    }


    @Override
    public void delete(String cartId) {
        cartRepository.deleteById(cartId);

    }
}

