package myapp;

import myapp.service.CartService;
import myapp.service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);

		ProductService productService = context.getBean(ProductService.class);
		productService.initialiseProductList();

		CartService cartService = context.getBean(CartService.class);
		cartService.initialiseCartList();
	}
}