package myapp.controller;

import lombok.AllArgsConstructor;
import myapp.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@AllArgsConstructor
public class LabController03 {

    private final ProductService productService;

    @GetMapping("/search-product/{productName}")
    public String getProductList(@PathVariable String productName, Model model) {
        model.addAttribute("productList", productService.searchProduct(productName));
        return "product/product-list";
    }

}
