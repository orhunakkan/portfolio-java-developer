package myapp.controller;

import myapp.model.Cart;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/cart-list")
public class LabController02 {

    @GetMapping("")
    public String getCartList(Model model) {
        List<Cart> cartList = new ArrayList<>();
//        Cart cart01 = new Cart();
//        Cart cart02 = new Cart();
//        cart01.setId(UUID.randomUUID());
//        cart01.setCartItemList(new ArrayList<>());
//        cart01.setCartTotalAmount(BigDecimal.ONE);
//        cart02.setId(UUID.randomUUID());
//        cart02.setCartItemList(new ArrayList<>());
//        cart02.setCartTotalAmount(BigDecimal.ONE);
//        cartList.add(cart01);
//        cartList.add(cart02);
        model.addAttribute("cartList", cartList);
        return "cart/cart-list";
    }
}
