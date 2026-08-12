package za.ac.cput.project3assignment.factory;

import za.ac.cput.project3assignment.domain.Cart;
import za.ac.cput.project3assignment.domain.User;

/* Abulele Ntwanambi
218276400
Cart factory class
12/08/2026
 */

public class CartFactory {
public static Cart createCart(String cartId, User user) {
        return new Cart.Builder()
                .setCartId(cartId)
                .setUser(user)
                .build();
    }
}
