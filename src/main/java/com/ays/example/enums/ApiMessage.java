package com.ays.example.enums;

import lombok.Getter;

@Getter
public enum ApiMessage {

  USERS_CREATE("UM-00001","User created successfully"),
  USERS_FIND("UM-00002","User retrieved successfully"),
  USERS_FIND_ALL("UM-00003","All users retrieved successfully"),
  USERS_UPDATE("UM-00004","User updated successfully"),
  USERS_DELETE("UM-00005","User deleted successfully")


  ;

  String code;
  String message;

  private ApiMessage(String code, String message) {
    this.code = code;
    this.message = message;
  }


}
