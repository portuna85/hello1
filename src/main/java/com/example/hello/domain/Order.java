package com.example.hello.domain;

public class Order {
    private Long mdmberId;
    private String itemName;
    private int itemPrice;
    private int discountPrice;

    public Order() {
    }

    public int calculatePrice() {

        return itemPrice - discountPrice;
    }

    public Order(Long mdmberId, String itemName, int itemPrice, int discountPrice) {
        this.mdmberId = mdmberId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.discountPrice = discountPrice;
    }

    public Long getMdmberId() {
        return mdmberId;
    }

    public void setMdmberId(Long mdmberId) {
        this.mdmberId = mdmberId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "mdmberId=" + mdmberId +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", discountPrice=" + discountPrice +
                '}';
    }
}