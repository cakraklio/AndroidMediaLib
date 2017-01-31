package org.example.pltw.medialib;

/**
 * Created by cakraklio on 1/23/2017.
 */

public class Movie {
    // instance variables - replace the example below with your own
    private int rating;
    private String Title;
    public Movie()
    {
        // initialise instance variables
        rating = 0;
        Title = "";
    }
    public void setRating(int l) {
        rating = l;
    }
    public int getRating(){
        return rating;
    }
    public void setTitle(String T) {
        Title = T;
    }
    public String getTitle(){
        return Title;
    }
}
