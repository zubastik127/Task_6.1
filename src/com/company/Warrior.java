package com.company;

public class Warrior extends Gnome implements Breaking{

    public Warrior(String nameGnome, String specializationGnome) {
        super(nameGnome, specializationGnome);
    }

    @Override
    public void run() {
        System.out.println("Сквернодрыг выпрыгивает из под земли");
    }

    @Override
    public void hitWithAMallet() {
        System.out.println("Гном уверенно бьет колотушкой");
    }

    @Override
    public void hideUnderAStone() {
        System.out.println("Сквернодрыг проваливается под камень");
    }

    @Override
    public void friend() {
        System.out.println("Гном узнает старого приятеля, ворчит. Эльф достает его из под камня, и вместе они, танцуя, идут в кабак.");
    }
}
