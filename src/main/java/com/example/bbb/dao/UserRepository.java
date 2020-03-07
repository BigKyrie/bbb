package com.example.bbb.dao;

import com.example.bbb.entity.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User,Integer>{
    @Query(value = "select * from t1 where username = ?;",nativeQuery = true)
    List<User> findByUsername(String username);
    @Query(value = "select * from t1 where username=? and password=?;",nativeQuery = true)
    List<User> findByUsernameAndPassword(String username, String password);

    @Modifying //may delete
    @Query(value = "delete from t1 where name = ?1;",nativeQuery = true)  //may delete
    int deleteByName(String name);  //may delete

}
