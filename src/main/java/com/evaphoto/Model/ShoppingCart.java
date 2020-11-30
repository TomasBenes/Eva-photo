package com.evaphoto.Model;

import javax.persistence.*;

@Entity
@Table(name = "shoppingcart")
public class ShoppingCart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "item_name")
    private String itemName;
    private Long price;
    @Column(name = "item_count")
    private Integer itemCount;
    @Column(name = "sub_price")
    private Long subPrice;
    @Column(name = "total_price")
    private Long totalPrice;

    public ShoppingCart(String itemName, Long price, Integer itemCount, Long subPrice, Long totalPrice) {
        this.itemName = itemName;
        this.price = price;
        this.itemCount = itemCount;
        this.subPrice = subPrice;
        this.totalPrice = totalPrice;
    }

    public ShoppingCart() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getItemCount() {
        return itemCount;
    }

    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    public Long getSubPrice() {
        return subPrice;
    }

    public void setSubPrice(Long subPrice) {
        this.subPrice = subPrice;
    }

    public Long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
    }
}
