package com.ecommerce.ecommerce.cart;

import com.ecommerce.ecommerce.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    public Cart addToCart(Cart cart) {
        return cartRepository.save(cart);
    }

    public List<Cart> getUserCart(Long userId) {
        return cartRepository.findByUserId(userId);
    }

    public void removeCartItem(Long cartId) {
        cartRepository.deleteById(cartId);
    }
}