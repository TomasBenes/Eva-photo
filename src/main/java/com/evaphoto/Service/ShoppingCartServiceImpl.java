package com.evaphoto.Service;

import com.evaphoto.Repository.ShoppingCartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService{

    private final ShoppingCartRepo shoppingCartRepo;

    @Autowired
    public ShoppingCartServiceImpl(ShoppingCartRepo shoppingCartRepo) {
        this.shoppingCartRepo = shoppingCartRepo;
    }
    
}
