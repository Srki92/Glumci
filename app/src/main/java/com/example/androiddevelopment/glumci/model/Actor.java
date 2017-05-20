package com.example.androiddevelopment.glumci.model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by androiddevelopment on 20.5.17..
 */

public class Actor {

    private int id;
    private String name;
    private String lastName;
    private String biography;
    private String image;
    private float rating;
    private Date dateOfBorn;
    private Date dateOfDeath;
    private String nameOfMovies;
    private ArrayList<String> movies;


    public Actor(){

    }

    public Actor(int id,String name, String lastName, String biography, String image, float rating, Date dateOfBorn, Date dateOfDeath, String nameOfMovies){

        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.biography = biography;
        this.image = image;
        this.rating = rating;
        this.dateOfBorn = dateOfBorn;
        this.dateOfDeath = dateOfDeath;
        this.nameOfMovies = nameOfMovies;
    }

    public int getId() {return id;}
    public String getName() {return name;}
    public String getLastName() {return lastName;}
    public String getBiography() {return biography;}
    public String getImage() {return image;}
    public float getRating() {return rating;}
    public Date getDateOfBorn() {return dateOfBorn;}
    public Date getDateOfDeath() {return  dateOfDeath;}
    public String getNameOfMovies() {return nameOfMovies;}


    public void setId(int id) {this.id = id;}
    public void setName(String name) {this.name = name;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setBiography(String biography) {this.biography = biography;}
    public void setImage(String image) {this.image = image;}
    public void setRating(float rating) {this.rating = rating;}
    public void setDateOfBorn(Date dateOfBorn) {this.dateOfBorn = dateOfBorn;}
    public void setDateOfDeath(Date dateOfDeath) {this.dateOfDeath = dateOfDeath;}
    public void setNameOfMovies(String nameOfMovies) {this.nameOfMovies = nameOfMovies;}


    @Override
    public String toString() {
        return "Actor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", biography='" + biography + '\'' +
                ", image='" + image + '\'' +
                ", rating=" + rating +
                ", dateOfBorn=" + dateOfBorn +
                ", dateOfDeath=" + dateOfDeath +
                ", nameOfMovies='" + nameOfMovies + '\'' +
                '}';
    }
}
