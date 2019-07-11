package com.stackroute.Domain;

public class Movie {
    public Actor getActor() {
        return actor;
    }
// set is used by autowire in Movie
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }

    Actor actor;


}
