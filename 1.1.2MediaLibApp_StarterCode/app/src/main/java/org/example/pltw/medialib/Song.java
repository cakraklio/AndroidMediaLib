package org.example.pltw.medialib;

/**
 * Created by cakraklio on 1/23/2017.
 */

public class Song {
    // instance variables - replace the example below with your own
    private int Rating;
    private String title;
    private double price;
    private boolean favorite;
    public Song()
    {
        // initialise instance variables
        Rating = 0;
        title = "";
        price = 0.0;
        favorite = false;
    }
    public String getTitle () {
        return title;
    }
    public void setTitle(String t) {
        title = t;
    }
    public int getRating() {
        return Rating;
    }
    public void setRating(int R) {
        Rating = R;
    }

    public double getPrice () {
        return price;
    }
    public void setPrice(double p) {
        price = p;
    }
    public void addToFavorites() {
        favorite = true;
    }
    public Song(String title, double price, int Rating) {
        this.title = title;
        this.price = price;
        this.Rating = Rating;
    }


}
