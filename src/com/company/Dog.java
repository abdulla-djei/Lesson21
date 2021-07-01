package com.company;

import java.util.Arrays;

public final class Dog extends Pet{

    private String name;
    private String breed;
    private String[] commands;

    public Dog(String layka, String овчарка, Color black, String[] strings){

    }

    public Dog(String name, String breed, Color color, Shelter shelter) {
        this.name = name;
        this.breed = breed;
        super.setColor(color);
        super.setShelter(shelter);
    }

    public Dog(String name, String breed, Color color,
               Shelter shelter, String[] commands) {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
        super.setColor(color);
        super.setShelter(shelter);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    public void makeVoice(String voice){
        System.out.println(voice);
    }
    public void makeVoice(String voice, String growl){
            System.out.println("Voice: "+voice +"\nGrowl: "+ growl);
    }

    public void makeVoice(String voice, int number){
        for (int i = 0; i < number; i++) {
            System.out.println("Voice: "+voice);
        }
    }

    @Override
    public final String getInfo() {
        if (commands == null){
            return super.getInfo() +
                    "\nName: " + name +
                    "\nBreed: " + breed;
        } else {
            return super.getInfo() +
                    "\nName: " + name +
                    "\nBreed: " + breed +
                    "\nCommands" + Arrays.toString(commands);
        }
    }
}