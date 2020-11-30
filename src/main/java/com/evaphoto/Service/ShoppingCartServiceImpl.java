package com.evaphoto.Service;

import com.evaphoto.Repository.ShoppingCartRepo;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService{

    private final ShoppingCartRepo shoppingCartRepo;

    public ShoppingCartServiceImpl(ShoppingCartRepo shoppingCartRepo) {
        this.shoppingCartRepo = shoppingCartRepo;
    }
    
}
