package za.ac.cput.project3assignment.service;

import za.ac.cput.project3assignment.domain.Cart;

import java.util.List;
/* Abulele Ntwanambi
218276400
Cart interface class
12/08/2026
 */

public interface ICart {

    Cart create(Cart cart);
    Cart read(String cartId);
    List<Cart> getAll();
    Cart update(Cart cart);
    void delete(String cartId);

}
