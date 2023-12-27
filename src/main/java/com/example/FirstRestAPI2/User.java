package com.example.FirstRestAPI2;

public class User{
    private int userId;
    private String name;
    private int age;

    public User(){ // nessesory to have defoult constructor

    }
    public User(String name, int age, int userId) {
        this.name = name;
        this.age = age;
        this.userId= userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }
    public int getuserId() {
        return userId;
    }
    public int setuserId() {
        return userId;
    }
}
