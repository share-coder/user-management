package com.ays.example.rest.dto;

import com.ays.example.model.Users;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto implements Serializable {

  private Long id;
  private String name;

  public static Users to(UserDto userDto) {
    Users users = new Users();
    if (userDto.getName() != null) {
      users.setName(userDto.getName());
    }
    return users;
  }

  public static UserDto from(Users users) {
    UserDto userDto = new UserDto();
    userDto.setId(users.getId());
    userDto.setName(userDto.getName());
    return userDto;
  }
}
