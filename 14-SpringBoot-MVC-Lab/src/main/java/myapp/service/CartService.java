
package myapp.service;

import myapp.model.Cart;
import myapp.model.CartItem;

import java.util.List;
import java.util.UUID;

public interface CartService {

    List<Cart> retrieveCartList();
    List<CartItem> retrieveCartDetail(UUID cartId);
    void initialiseCartList();

}
