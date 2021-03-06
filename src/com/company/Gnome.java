package com.company;

public abstract class Gnome {

    private String nameGnome;
    private String specializationGnome;

    public Gnome(String nameGnome, String specializationGnome) {
        this.nameGnome = nameGnome;
        this.specializationGnome = specializationGnome;
    }

    public String getNameGnome() {
        return nameGnome;
    }

    public String getSpecializationGnome() {
        return specializationGnome;
    }

    public abstract void run();

    public abstract void friend();

    public void dead(){
        System.out.println("К сожалению, Сквернодрыг умирает");
    }

}
