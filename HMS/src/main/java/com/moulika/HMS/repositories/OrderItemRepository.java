package com.moulika.HMS.repositories;

import org.springframework.data.repository.CrudRepository;

import com.moulika.HMS.models.OrderItem;

public interface OrderItemRepository extends CrudRepository<OrderItem,Integer>{

}
