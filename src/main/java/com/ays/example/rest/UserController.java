package com.ays.example.rest;

import com.ays.example.enums.ApiMessage;
import com.ays.example.rest.dto.UserDto;
import com.ays.example.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class UserController extends BaseController {

  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @PostMapping("/users")
  public ResponseEntity<ApiResponse<?>> createUser(@RequestBody UserDto userDto) {
    userDto = userService.createUser(userDto);
    return toResponse(ApiMessage.USERS_CREATE, userDto, HttpStatus.OK);
  }

  @GetMapping("/users/{id}")
  public ResponseEntity<ApiResponse<?>> findUserById(@PathVariable Long id) {
    return null;
  }

  @GetMapping("/users")
  public ResponseEntity<ApiResponse<?>> findUserAll(
      @RequestParam(required = false, defaultValue = "1") Integer page,
      @RequestParam(required = false, defaultValue = "10") Integer pageSize,
      @RequestParam(required = false, defaultValue = "id") String sortBy,
      @RequestParam(required = false, defaultValue = "asc") String orderBy) {
    return null;
  }

  @GetMapping("/users/{id}")
  public ResponseEntity<ApiResponse<?>> updateUser(@PathVariable Long id) {
    return null;
  }

  @GetMapping("/users/{id}")
  public ResponseEntity<ApiResponse<?>> deleteUser(@PathVariable Long id) {
    return null;
  }
}
