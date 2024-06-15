package myapp.controller;

import lombok.AllArgsConstructor;
import myapp.service.CartService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@Controller
@RequestMapping("/cart-list")
@AllArgsConstructor
public class LabController02 {

    private final CartService cartService;

    @GetMapping("")
    public String getCartList(Model model) {
        model.addAttribute("cartList", cartService.retrieveCartList());
        return "cart/cart-list";
    }

    @GetMapping("/{cartId}")
    public String getCartItemList(Model model, @PathVariable UUID cartId) {
        model.addAttribute("cartItemList", cartService.retrieveCartDetail(cartId));
        return "cart/cart-detail";
    }
}
