package com.evaphoto.Repository;

import com.evaphoto.Model.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingCartRepo extends JpaRepository <ShoppingCart, Integer> {


}
