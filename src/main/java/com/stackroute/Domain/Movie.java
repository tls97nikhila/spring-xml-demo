package com.stackroute.Domain;

public class Movie {
    public Actor getActor() {
        return actor;
    }

    public Movie(Actor actor) {
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
