package com.example.hazimalraddadi.tour;

/**
 * Created by hazimalraddadi on 12/21/17.
 */

public class Locations {

    private int LocationPicture;
    private int Name;
    private int About;

    public Locations(int locationPicture, int name, int about) {
        LocationPicture = locationPicture;
        Name = name;
        About = about;
    }

    public int getLocationPicture() {
        return LocationPicture;
    }

    public int getName() {
        return Name;
    }

    public int getAbout() {
        return About;
    }
}
