package main.java.me.dio.service;

import main.java.me.dio.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}