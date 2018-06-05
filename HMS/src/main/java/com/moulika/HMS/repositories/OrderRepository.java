package com.moulika.HMS.repositories;

import org.springframework.data.repository.CrudRepository;

import com.moulika.HMS.models.Order;

public interface OrderRepository extends CrudRepository<Order,Integer>,OrderRepositoryCustom{

}
