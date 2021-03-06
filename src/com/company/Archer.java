package com.company;

public class Archer extends Elf implements Shooting {

    public Archer(String nameElf, String specializationElf) {
        super(nameElf, specializationElf);
    }

    @Override
    public void run() {
        System.out.println("Прекраснопляс гордо возвышается на поле боя");
    }

    @Override
    public void bowShot() {
        System.out.println("Эльф метко стреляет из лука");
    }

    @Override
    public void hidBehindATree() {
        System.out.println("Прекраснопляс в танце прячется за деревом");
    }

    @Override
    public void laugh() {
        System.out.println("Эльф закатывается хохотом");
    }
}
