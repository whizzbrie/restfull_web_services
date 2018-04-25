package com.rest.webservices.restfulwebservices.user;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();
    private static int usersCount = 7;

    static {
        users.add(new User(1, "Adam", new Date()));
        users.add(new User(2, "Brian", new Date()));
        users.add(new User(3, "Tom", new Date()));
        users.add(new User(4, "Beryl", new Date()));
        users.add(new User(5, "Peter", new Date()));
        users.add(new User(6, "John", new Date()));
        users.add(new User(7, "Zack", new Date()));
    }

    public List<User> findAll(){
        return users;
    }

    public User save(User user){
        if(user.getId() == null){
            user.setId(++usersCount);
        }
        users.add(user);
        return user;
    }

    public User findOne(int id){
        for(User user:users){
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }
}
