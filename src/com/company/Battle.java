package com.company;

public class Battle {

    public static void start() {

        Archer archer = new Archer("Прекраснопляс", "лучник");
        Warrior warrior = new Warrior("Сквернодрыг", "воин");

        archer.run();

        warrior.run();

        warrior.hitWithAMallet();

        archer.hidBehindATree();

        archer.bowShot();

        warrior.hideUnderAStone();

        archer.laugh();

        warrior.friend();

    }
}
