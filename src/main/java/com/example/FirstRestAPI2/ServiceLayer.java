package com.example.FirstRestAPI2;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class ServiceLayer {
    RepositoryLayer repoObj = new RepositoryLayer();

    public String addUserToDb(User user) {
        String result = repoObj.addUserToDb(user);
        return result;

    }
public User getFromDb(int userId){
 User userObj = repoObj.getFromDb(userId);
 return userObj;

}

public String getNameOfYoungestage(){

        List<User> allUser = repoObj.getAllUser();
        int min = 100;
        String ansName = null;
        for(User user : allUser){
            if(user.getAge()<min){
                min = user.getAge();
                ansName = user.getName();

            }

        }
        return ansName;
}

}
