package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotNull(message = "Location is Required")
    @Size(min = 3, max = 100)
    private String location;

    @OneToMany
    @JoinColumn
    private final List<Job> employers = new ArrayList<>();

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

    public List<Job> getJobs() {
        return employers;
    }


}
