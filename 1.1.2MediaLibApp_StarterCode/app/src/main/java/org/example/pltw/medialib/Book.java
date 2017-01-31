package org.example.pltw.medialib;

/**
 * Created by cakraklio on 1/23/2017.
 */

public class Book {
    // instance variables - replace the example below with your own
    private int rating;
    private String Title;
    public Book()
    {
        // initialise instance variables
        rating = 0;
        Title = "";
    }
    public String getTitle() {
        return Title;
    }
    public void setTitle(String T) {
        Title = T;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int r) {
        rating = r;
    }
}
