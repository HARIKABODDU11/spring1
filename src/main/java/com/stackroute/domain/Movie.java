package com.stackroute.domain;

public class Movie {
    //Movie “has a” Actor that can be initialized via the corresponding setter method.
    Actor actor;

    public Movie(){ }


    public void displayActor()

        {
        actor.display();
        }


    public void setActor(Actor actor) {
        this.actor = actor;
    }
}
