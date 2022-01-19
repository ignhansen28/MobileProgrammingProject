package com.example.blabla;

public class MovieModelClass {

    String title;
    String rating;
    String image;

    public MovieModelClass(String title, String rating, String image) {
        this.title = title;
        this.rating = rating;
        this.image = image;
    }

    public MovieModelClass() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
