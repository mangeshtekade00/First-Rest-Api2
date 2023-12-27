package com.example.FirstRestAPI2;


import org.springframework.web.bind.annotation.*;


import java.util.HashMap;
import java.util.Map;


@RestController //this tells to spring application that this class has Api written

public class ApiClass {

    Map<Integer,User> userDb = new HashMap<>();

    @GetMapping("/getWeatherUpdate")

    public String getWeatherUpdate(){
        return "Weather is good and Winds are blooing at 20km/hr" +
                "Tempreture is 30C and Humidity is 30%";
    }

    @PostMapping("/addUserViaBody")
    public String addUserViaReqBody(@RequestBody User userObj){
        int dbKey = userObj.getuserId();
        userDb.put(dbKey, userObj);
        return " user has been  added to Data Base";
    }
    @GetMapping("/addUser")

    public String addUser(@RequestParam("userId") Integer userId ,
                          @RequestParam("age") Integer age,
                          @RequestParam("name") String name ) {
        // add to db

        User userObj = new User(name, age, userId);
        int dbKey = userId;
        userDb.put(dbKey,userObj);
        return "user has been added to DB";
    }
    @GetMapping("/getUserInfo")
    public User getUser(@RequestParam("userId") int userId){
        User user = userDb.get(userId);
        return user;
    }

}
