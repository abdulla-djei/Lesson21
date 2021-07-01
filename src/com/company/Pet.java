package com.company;

import java.util.Random;

public class Pet extends Shelter {

    private int age = generateDefaultAge();
    private Color color;
    private Shelter shelter;

    public Pet(String name, String address) {
        super(name, address);
    }

    public int getAge() {
        return age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    private int generateDefaultAge() {
        Random random = new Random();
        return random.nextInt(10)+3;
    }

    public String getInfo() {
        return    "Age: " + age +
                "\nColor: " + color +
                "\nShelter Address: " + shelter.getAddress() +
                "\nShelter name: " + shelter.getName();
    }
}
