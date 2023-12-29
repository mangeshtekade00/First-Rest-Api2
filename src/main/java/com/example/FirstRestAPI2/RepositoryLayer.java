package com.example.FirstRestAPI2;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class RepositoryLayer {
    Map<Integer,User> userDb = new HashMap<>();
public String addUserToDb(User user){
 int dbKey = user.getuserId();
    userDb.put(dbKey,user);
    return "user has been added to DB";
}
public User getFromDb(int userId){
    return userDb.get(userId);
}
public List<User> getAllUser(){
    //need list of user obj present in hashmap

    List<User> userList = new ArrayList<>();
    for(User user:userDb.values()){
        userList.add(user);
    }
    return userList;
}
}
