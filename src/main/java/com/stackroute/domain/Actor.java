package com.stackroute.domain;

public class Actor {
    //Actor has two String properties, name and gender, and an age property of type int.
    String name;
    String gender;
    int age;

    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    //setter and getter methods of actor

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }


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
