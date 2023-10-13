package me.dio.service.impl;

import me.dio.domain.model.User;
import me.dio.domain.repository.UserRepository;
import me.dio.dtos.UserDTO;
import me.dio.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User findById(Long id) {
        return this.userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User createUser(UserDTO data) {
        if (userRepository.existsByAccountNumber(data.account().getNumber())) {
            throw new IllegalArgumentException("This account number already exists.");
        }
        User newUser = new User(data);
        this.saveUser(newUser);
        return newUser;
    }

    public List<User> getAllUsers(){return this.userRepository.findAll();}

    public void saveUser(User user){
        this.userRepository.save(user);
    }
}
