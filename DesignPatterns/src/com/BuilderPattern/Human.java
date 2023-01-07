/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BuilderPattern;

import java.util.Date;

/**
 *
 * @author vamsee.n
 */
public class Human {
    private final String name;
    private final String lastName;
    private final int age;
    private final String height;
    private final String weight;
    private final String eyesColor;
    private final String hairColor;
    private final String birthPlace;
    private final Date birthDate;
    private final int numberOfSibling;
    private final boolean married;

    public Human(HumanBuilder builder) {
        this.name = builder.name;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.height = builder.height;
        this.weight = builder.weight;
        this.eyesColor = builder.eyesColor;
        this.hairColor = builder.hairColor;
        this.birthPlace = builder.birthPlace;
        this.birthDate = builder.birthDate;
        this.numberOfSibling = builder.numberOfSibling;
        this.married = builder.married;
    }
    
    
    
    public static class HumanBuilder {
    
        private  String name;
    private  String lastName;
    private  int age;
    private  String height;
    private  String weight;
    private  String eyesColor;
    private  String hairColor;
    private  String birthPlace;
    private  Date birthDate;
    private  int numberOfSibling;
    private  boolean married;

        public HumanBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public HumanBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public HumanBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public HumanBuilder setHeight(String height) {
            this.height = height;
            return this;
        }

        public HumanBuilder setWeight(String weight) {
            this.weight = weight;
            return this;
        }

        public HumanBuilder setEyesColor(String eyesColor) {
            this.eyesColor = eyesColor;
            return this;
        }

        public HumanBuilder setHairColor(String hairColor) {
            this.hairColor = hairColor;
            return this;
        }

        public HumanBuilder setBirthPlace(String birthPlace) {
            this.birthPlace = birthPlace;
            return this;
        }

        public HumanBuilder setBirthDate(Date birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public HumanBuilder setNumberOfSibling(int numberOfSibling) {
            this.numberOfSibling = numberOfSibling;
            return this;
        }

        public HumanBuilder setMarried(boolean married) {
            this.married = married;
            return this;
        }
    
        public Human build(){
            Human human = new Human(this);
            return human;
        }
   
}

    @Override
    public String toString() {
        return "Human{" + "name=" + name + ", lastName=" + lastName + ", age=" + age + ", height=" + height + ", weight=" + weight + ", eyesColor=" + eyesColor + ", hairColor=" + hairColor + ", birthPlace=" + birthPlace + ", birthDate=" + birthDate + ", numberOfSibling=" + numberOfSibling + ", married=" + married + '}';
    }
    
    
}
