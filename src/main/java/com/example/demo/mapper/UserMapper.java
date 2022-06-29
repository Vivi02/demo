package com.example.demo.mapper;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface UserMapper {

    //User
    public List<User> findAll();
    public void insert(User user);
    public void update(User user);
    public void deleteById(String id);


}
