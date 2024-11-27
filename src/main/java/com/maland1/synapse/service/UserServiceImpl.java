package com.maland1.synapse.service;

import com.maland1.synapse.exception.UserNotFoundException;
import com.maland1.synapse.model.User;
import com.maland1.synapse.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService
{

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) throws UserNotFoundException {
        return userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("No user found with id: " + id));
    }

    @Override
    public User getUserByUsername(String username) throws UserNotFoundException {
        return userRepository.findByUsername(username);
    }

    @Override
    public User saveUser(User user) {
        user.setPassword(user.getPassword());
        return userRepository.save(user);
    }
}
