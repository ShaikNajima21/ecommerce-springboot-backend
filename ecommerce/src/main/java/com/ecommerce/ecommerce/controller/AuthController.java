package com.ecommerce.ecommerce.controller;

import com.ecommerce.ecommerce.entity.User;
import com.ecommerce.ecommerce.jwt.JwtUtil;
import com.ecommerce.ecommerce.jwt.LoginRequest;
import com.ecommerce.ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    private JwtUtil jwtUtil = new JwtUtil();

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {

        Optional<User> optionalUser = userRepository.findFirstByEmail(request.getEmail());

        if (optionalUser.isPresent()) {
            User user = optionalUser.get();

            if (user.getPassword().equals(request.getPassword())) {
                return jwtUtil.generateToken(user.getEmail());
            }
        }

        return "Invalid credentials";
    }
}