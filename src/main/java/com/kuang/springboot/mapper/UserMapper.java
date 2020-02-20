package com.kuang.springboot.mapper;

import com.kuang.springboot.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper //表示这个注解是mybatis的mapper类:Dao
public interface UserMapper {
    List<User> queryUserList();
    User queryUserList(int id);
    int  addUser(User user);
    int updataUser (User user);
    int deleteUser (int id);
}
