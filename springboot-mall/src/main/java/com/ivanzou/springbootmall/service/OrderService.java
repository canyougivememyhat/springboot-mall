package com.ivanzou.springbootmall.service;

import com.ivanzou.springbootmall.dto.CreateOrderRequest;
import com.ivanzou.springbootmall.dto.OrderQueryParams;
import com.ivanzou.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
