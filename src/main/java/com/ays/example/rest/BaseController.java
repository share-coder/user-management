package com.ays.example.rest;

import com.ays.example.enums.ApiMessage;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class BaseController {

  @Data
  @AllArgsConstructor
  @NoArgsConstructor
  @Builder
  public static class ApiResponse<D> {

    String code;
    String message;
    D data;
  }

  public ResponseEntity<ApiResponse<?>> toResponse(ApiMessage message, Object data, HttpStatus httpStatus){
    ApiResponse<Object> apiResponse = ApiResponse.builder().code(message.getCode())
        .message(message.getMessage()).data(data).build();
    return new ResponseEntity<>(apiResponse, httpStatus);
  }

}
