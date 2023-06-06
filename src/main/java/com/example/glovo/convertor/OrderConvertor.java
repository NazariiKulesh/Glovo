package com.example.glovo.convertor;

import com.example.glovo.entity.OrderEntity;
import com.example.glovo.model.Order;

public class OrderConvertor {
    public static Order orderEntityToOrder(OrderEntity orderEntity){
        return Order.builder()
                .id(orderEntity.getId())
                .cost(orderEntity.getCost())
                .date(orderEntity.getDate()).build();

    }
    public static OrderEntity orderToOrderEntity(Order order){
        return OrderEntity.builder().id(order.getId())
                .cost(order.getCost())
                .date(order.getDate())
                .build();

    }

}
