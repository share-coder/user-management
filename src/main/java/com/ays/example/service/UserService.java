package com.ays.example.service;

import com.ays.example.repository.UserRepository;
import com.ays.example.rest.dto.UserDto;
import com.ays.example.utils.Validator;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public UserDto createUser(UserDto userDto) {
    Validator.validateName(userDto.getName());
    return UserDto.from(userRepository.save(UserDto.to(userDto)));
  }
}
