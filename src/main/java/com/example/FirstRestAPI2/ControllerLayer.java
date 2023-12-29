package com.example.FirstRestAPI2;

import org.springframework.web.bind.annotation.*;

@RestController

public class ControllerLayer {

    ServiceLayer serviceObj = new ServiceLayer();
    @PostMapping("/addToDb")
    public String addToDb(@RequestBody User user){
String result = serviceObj.addUserToDb(user);
return result;
    }
    @GetMapping("/addToDb")
    public User getFromDb(@RequestParam("userId")Integer userId){
User userObj = serviceObj.getFromDb(userId);
       return userObj;
    }

    @GetMapping("/getNameOfYoungestAge")
    public String getNameOfPerson(){

    }
}
