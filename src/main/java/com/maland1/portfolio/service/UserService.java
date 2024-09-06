package com.maland1.portfolio.service;

import com.maland1.portfolio.exception.UserNotFoundException;
import com.maland1.portfolio.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService
{
    List<User> getAllUsers();

    User getUserById(Long id) throws UserNotFoundException;

    User getUserByUsername(String username) throws UserNotFoundException;

    User saveUser(User user);
}
