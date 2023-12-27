package com.example.FirstRestAPI2;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //this tells to spring application that this class has Api written

public class ApiClass {
    @GetMapping("/getWeatherUpdate")

    public String getWeatherUpdate(){
        return "Weather is good and Winds are blooing at 20km/hr" +
                "Tempreture is 30C and Humidity is 30%";
    }
}
