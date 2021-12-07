package com.ays.example.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
@Setter
@Getter
public class Users {

  @Id
  private Long id;

  @Column(name = "name")
  private String name;


}
