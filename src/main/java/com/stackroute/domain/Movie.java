package com.stackroute.domain;


//Movie “has a” Actor that can be initialized via the corresponding setter method.

public class Movie {
    private Actor actor;

    public void setActor(Actor actor)
    {
        this.actor = actor;
    }


        public void displayActor()
        {
        actor.display();
        }




}
