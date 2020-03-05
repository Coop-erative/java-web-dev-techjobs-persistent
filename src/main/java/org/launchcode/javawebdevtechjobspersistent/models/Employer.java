package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotNull(message = "Location is Required")
    @Size(min = 3, max = 100)
    private String location;

    //Constructors
    public Employer(String location) {
        this.location = location;
    }

    //No-arg constructor for Hibernate to create an object
    public Employer() {}

    //Getters and Setters
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
