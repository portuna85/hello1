package com.example.hello.service;

import com.example.hello.domain.Order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
