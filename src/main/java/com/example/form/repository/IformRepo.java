package com.example.form.repository;

import javax.persistence.Id;
import javax.validation.Valid;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.form.model.User;

public interface IformRepo extends JpaRepository<User,Integer>{

 

}
