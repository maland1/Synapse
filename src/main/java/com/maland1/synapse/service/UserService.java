package com.maland1.synapse.service;

import com.maland1.synapse.exception.UserNotFoundException;
import com.maland1.synapse.model.User;
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
