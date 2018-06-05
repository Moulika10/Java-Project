package com.moulika.HMS.repositories;

import org.springframework.data.repository.CrudRepository;

import com.moulika.HMS.models.User;

public interface UserRepository extends CrudRepository<User,Integer>,UserRepositoryCustom{

}
