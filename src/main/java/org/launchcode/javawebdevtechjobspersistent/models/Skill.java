package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @ManyToMany(mappedBy = "skills")
    @NotNull
    private final List<Job> jobs = new ArrayList<>();

    @NotNull
    @Size(min=3,max=250)
    private String description;

    //Constructors
    public Skill(String description) {
        this.description = description;
    }

    //No-arg constructor for Hibernate to create an object
    public Skill() {}

    //Getters and Setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }
}