package za.ac.cput.project3assignment.controller;

import org.springframework.web.bind.annotation.*;
import za.ac.cput.project3assignment.domain.Cart;
import za.ac.cput.project3assignment.service.CartService;

import java.util.List;

/* Abulele Ntwanambi
218276400
Cart controller class
12/08/2026
 */


@RestController
@RequestMapping("/api/cart")
@CrossOrigin(origins = "http://localhost:5173")
public class CartController {
    private final CartService cartService;
    public CartController(CartService cartService){
        this.cartService = cartService;
    }

    @PostMapping
    public Cart create(@RequestBody Cart cart) {
        return cartService.create(cart);
    }
    @GetMapping("/{cartId}")
    public Cart read(@PathVariable String cartId) {
        return cartService.read(cartId);
    }
    @GetMapping
    public List<Cart> getAll() {
        return cartService.getAll();
    }
    @PutMapping
    public Cart update(@RequestBody Cart cart) {
        return cartService.update(cart);
    }
    @DeleteMapping("/{cartId}")
    public void delete(@PathVariable String cartId) {
        cartService.delete(cartId);
    }
}
