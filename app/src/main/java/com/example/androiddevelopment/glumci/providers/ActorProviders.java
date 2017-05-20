package com.example.androiddevelopment.glumci.providers;

import com.example.androiddevelopment.glumci.model.Actor;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by androiddevelopment on 20.5.17..
 */

public class ActorProviders {

    public static List<Actor> getActors() {

        Calendar c = new GregorianCalendar();
        c.set(1940,5,5);
        Date d = new Date(c.getTimeInMillis());

        Calendar c1 = new GregorianCalendar();
        c1 = null;
        Date d1 = new Date(c1.getTimeInMillis());

        Calendar c2 = new GregorianCalendar();
        c2.set(1958,9,6);
        Date d2 = new Date(c2.getTimeInMillis());

        Calendar c3 = new GregorianCalendar();
        c3 = null;
        Date d3 = new Date(c3.getTimeInMillis());

        Calendar c4 = new GregorianCalendar();
        c4.set(1947,4,7);
        Date d4 = new Date(c4.getTimeInMillis());


        Calendar c5 = new GregorianCalendar();
        c5 = null;
        Date d5 = new Date(c5.getTimeInMillis());



        List<Actor> actors = new ArrayList<>();



        actors.add(new Actor(0,"Brad" , "Pitt", "He has received multiple awards and nominations including an Academy Award as producer under his own company Plan B Entertainment." , "Brad_Pitt.jpg", 5.0f ,d,d1,"Fury"  ));
        actors.add(new Actor(1,"Scott" , "Adkins" , "Scott Adkins was born in Sutton Coldfield, England, on 17 June 1976.","Scott_Adkins.jpg", 4.0f ,d2,d3,"Undisputed"));
        actors.add(new Actor(2,"Vin" , "Diesel", "Diesel was born as Mark Sinclair in Alameda County, California, along with his twin brother, Paul.","Vin_Diesel.jpg" , 4.0f,d4,d5,"Fast & Furious"));
        return actors;
    }

    public static List<String> getActorNames() {

        List<String> names = new ArrayList<>();
        names.add("Brad_Pitt");
        names.add("Scott_Adkins");
        names.add("Vin_Diesel");
        return names;
    }
}
