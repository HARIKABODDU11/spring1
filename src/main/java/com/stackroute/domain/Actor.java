package com.stackroute.domain;

public class Actor {
    String name;
    String gender;
    int age;

  //setter methods for actor paramaters
    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void display(){

        System.out.println("actor details:" +name +"\n"+gender+"\n"+age);
    }

}
