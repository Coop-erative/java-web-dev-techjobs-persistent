package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.Max;

@Entity
public class Skill extends AbstractEntity {
    @Max(350)
    private String skill;

    //Constructors
    public Skill(String skill) {
        this.skill = skill;
    }

    //No-arg constructor for Hibernate to create an object
    public Skill() {}

    //Getters and Setters

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}