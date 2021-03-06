package com.company;

public abstract class Elf {

    private String nameElf;
    private String specializationElf;

    public Elf(String nameElf, String specializationElf) {
        this.nameElf = nameElf;
        this.specializationElf = specializationElf;
    }

    public String getNameElf() {
        return nameElf;
    }

    public String getSpecializationElf() {
        return specializationElf;
    }

    public abstract void run();

    public abstract void laugh();

    public void dead() {
        System.out.println("К сожалению, Прекраснопляс умирает");
    }

}
