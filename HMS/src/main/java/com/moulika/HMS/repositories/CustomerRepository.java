package com.moulika.HMS.repositories;

import org.springframework.data.repository.CrudRepository;

import com.moulika.HMS.models.Customer;

public interface CustomerRepository extends CrudRepository<Customer,Integer>,CustomerRepositoryCustom{

}
