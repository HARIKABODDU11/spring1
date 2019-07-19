package com.stackroute.domain;

public class Movie {
    //Movie “has a” Actor that can be initialized via the corresponding setter method.
    private Actor actor;
    

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public void setActor(Actor actor)
    {
        this.actor = actor;
    }


        public void displayActor()
        {
        actor.display();
        }




}
