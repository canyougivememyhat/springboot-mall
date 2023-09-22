package com.ivanzou.springbootmall.service;

import com.ivanzou.springbootmall.dto.CreateOrderRequest;
import com.ivanzou.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
