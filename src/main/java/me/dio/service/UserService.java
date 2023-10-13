package me.dio.service;

import me.dio.domain.model.User;
import me.dio.dtos.UserDTO;

public interface UserService {
    User findById(Long id);

    User createUser(UserDTO data);
}
