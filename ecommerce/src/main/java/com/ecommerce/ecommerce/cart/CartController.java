package com.ecommerce.ecommerce.cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    // Add product to cart
    @PostMapping("/add")
    public Cart addToCart(@RequestBody Cart cart) {
        return cartService.addToCart(cart);
    }

    // Get all cart items for a user
    @GetMapping("/user/{userId}")
    public List<Cart> getUserCart(@PathVariable Long userId) {
        return cartService.getUserCart(userId);
    }

    // Remove item from cart
    @DeleteMapping("/{cartId}")
    public void removeCartItem(@PathVariable Long cartId) {
        cartService.removeCartItem(cartId);
    }
}