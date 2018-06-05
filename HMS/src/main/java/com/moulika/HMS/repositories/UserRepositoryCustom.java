package com.moulika.HMS.repositories;

import com.moulika.HMS.models.User;

public interface UserRepositoryCustom {
public User verifyLogin(String user, String pass);
}
